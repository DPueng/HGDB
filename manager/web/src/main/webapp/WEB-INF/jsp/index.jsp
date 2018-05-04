<%--
  Created by IntelliJ IDEA.
  User: dpeng
  Date: 18-5-2
  Time: 下午8:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <head>
        <meta charset="UTF-8">
        <title>index</title>
        <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.js"></script>
    </head>
</head>
<body>
<div class="selector">
    选择需要展示的expId： <br>
    1:<input type="checkbox" class="indexList"/>
    2:<input type="checkbox" class="indexList"/>
    3:<input type="checkbox" class="indexList"/>
    4:<input type="checkbox" class="indexList"/>
    5:<input type="checkbox" class="indexList"/>
    选取的expId:
    <span class="selectedIndexList"></span><br>

    选择sampleId:
    <select class="selectSampleId">

    </select><br>

    选择sortId:
    <select class="selectSortId">
    </select>


    <select class="sortType">
        <option>ASC</option>
        <option>DESC</option>
    </select><br>
    FoldChange: <input type="text" class="downFoldChange" value="2.50"/> ~ <input type="text" class="topFoldChange" value="2.50"/><br>
    pageLength: <input type="text" class="pageLength" value="30"/><br>
    <button onclick="commit()">提交</button>
</div>
<div id="compareResult">

</div>


</body>

<script>
    $(function () {
        let indexListSelectors = document.querySelectorAll(".indexList");
        let selectedIndexList = document.querySelector(".selectedIndexList");
        let selectSampleId = document.querySelector(".selectSampleId");
        let selectSortId = document.querySelector(".selectSortId");
        let indexList = [];
        for (let i = 0; i < indexListSelectors.length; i++) {
            indexListSelectors[i].index = i + 1;
            indexListSelectors[i].onchange = function () {
                // 展示选取的expId
                if (this.checked) {
                    indexList.push(this.index)
                } else {
                    let sendIndex = indexList.indexOf(this.index);
                    indexList.splice(sendIndex, 1);
                }
                selectedIndexList.innerHTML = indexList.join(',');

                // 根据选择的expId生成可选择的sampleId
                let htmlSelect = "<option>0</option>";
                for (let i = 0; i < indexList.length; i++) {
                    htmlSelect += '<option>' + indexList[i] + '</option>'
                }
                selectSampleId.innerHTML = htmlSelect;
                selectSampleId.onchange = function () {
                    htmlSelect = "<option>0</option>";
                    for (let i = 0; i < indexList.length; i++) {
                        if (indexList[i] != selectSampleId.value) {
                            htmlSelect += '<option>' + indexList[i] + '</option>'
                        }
                    }
                    selectSortId.innerHTML = htmlSelect;
                };

            }
        }
    });

    function commit() {
        pageBegin = 0;

        let indexListDoc = document.querySelectorAll('.indexList');
        let indexList = [];
        for (let i = 0; i < indexListDoc.length; i++) {
            if (indexListDoc[i].checked) {
                indexList.push(indexListDoc[i].index);
            }
        }
        let sampleId = document.querySelector(".selectSampleId");
        let sortId = document.querySelector(".selectSortId");
        let sortType = document.querySelector(".sortType");
        let topFoldChange = document.querySelector(".topFoldChange");
        let downFoldChange = document.querySelector(".downFoldChange");
        let pageLength = document.querySelector(".pageLength");

        let jsonData = {
            'strIndexList': indexList.join(","),
            'sampleId': sampleId.value,
            'sortIndex': sortId.value,
            'sortType': sortType.value,
            'pageBegin': pageBegin,
            'pageLength': pageLength.value,
            'topFoldChange': topFoldChange.value,
            'downFoldChange': downFoldChange.value
        };

        $.ajax({
            type: 'get',
            dataType: 'JSON',
            data: jsonData,
            url: 'http://localhost:8080/entryCount',
            success: function (data) {
                pageCount = data;
            }
        });

        $.ajax({
            type: 'get',
            dataType: 'JSON',
            data: jsonData,
            url: 'http://localhost:8080/init',
            success: function (data) {
                let html = [];
                html.push("<table border='1px' cellspacing=0 cellpadding=0><thead><tr><td rowspan='2'>ProteinID</td><td rowspan='2'>Symbol</td> <td rowspan='2'>Description</td> <td rowspan='2'>MW(kDa)</td>");
                html.push("<td colspan='3'>sample exp:" + data.requestPojo.sampleId + "</td>");
                for (let i = 0; i < data.requestPojo.indexList.length; i++) {
                    html.push("<td colspan='3'>Exp:" + data.requestPojo.indexList[i] + "</td>");
                }
                html.push("</tr><tr>");
                for (let i = -1; i < data.requestPojo.indexList.length; i++) {
                    html.push("<td>FC</td><td>Ratio</td><td>PN</td>");
                }
                html.push("</tr></thead><tbody>");
                for (let i = 0; i < data.resultPojoList.length; i++) {
                    html.push("<tr>");
                    html.push("<td>" + data.resultPojoList[i].accession + "</td>");
                    html.push("<td>" + data.resultPojoList[i].description + "</td>");
                    html.push("<td>" + data.resultPojoList[i].geneSymbol + "</td>");
                    html.push("<td>" + data.resultPojoList[i].molecularWeight + "</td>");

                    html.push("<td>" + data.resultPojoList[i]["fc" + data.requestPojo.sampleId] + "</td>");
                    html.push("<td>" + data.resultPojoList[i]["ratio" + data.requestPojo.sampleId] + "</td>");
                    html.push("<td>" + data.resultPojoList[i]["peptideNum" + data.requestPojo.sampleId] + "</td>");

                    for (let j = 0; j < data.requestPojo.indexList.length; j++) {
                        html.push("<td>" + data.resultPojoList[i]["fc" + data.requestPojo.indexList[j]] + "</td>");
                        html.push("<td>" + data.resultPojoList[i]["ratio" + data.requestPojo.indexList[j]] + "</td>");
                        html.push("<td>" + data.resultPojoList[i]["peptideNum" + data.requestPojo.indexList[j]] + "</td>");
                    }
                    html.push("</tr>")
                }
                html.push("</tbody></table>");
                html.push("entryCount: " + pageCount);
                if (pageCount > pageBegin + parseInt(pageLength.value))
                    html.push("<button onclick='nextPage()'>下一页</button>");
                document.getElementById("compareResult").innerHTML = html.join("");
            }
        })
    }

    function nextPage() {
        let indexListDoc = document.querySelectorAll('.indexList');
        let indexList = [];
        for (let i = 0; i < indexListDoc.length; i++) {
            if (indexListDoc[i].checked) {
                indexList.push(indexListDoc[i].index);
            }
        }
        let sampleId = document.querySelector(".selectSampleId");
        let sortId = document.querySelector(".selectSortId");
        let sortType = document.querySelector(".sortType");
        let topFoldChange = document.querySelector(".topFoldChange");
        let downFoldChange = document.querySelector(".downFoldChange");
        let pageLength = document.querySelector(".pageLength");

        pageBegin += parseInt(pageLength.value);
        let jsonData = {
            'strIndexList': indexList.join(","),
            'sampleId': sampleId.value,
            'sortIndex': sortId.value,
            'sortType': sortType.value,
            'pageBegin': pageBegin,
            'pageLength': pageLength.value,
            'topFoldChange': topFoldChange.value,
            'downFoldChange': downFoldChange.value
        };

        console.log(jsonData);

        $.ajax({
            type: 'get',
            dataType: 'JSON',
            data: jsonData,
            url: 'http://localhost:8080/init',
            success: function (data) {
                let html = [];
                html.push("<table border='1px' cellspacing=0 cellpadding=0><thead><tr><td rowspan='2'>ProteinID</td><td rowspan='2'>Symbol</td> <td rowspan='2'>Description</td> <td rowspan='2'>MW(kDa)</td>");
                html.push("<td colspan='3'>sample exp:" + data.requestPojo.sampleId + "</td>");
                for (let i = 0; i < data.requestPojo.indexList.length; i++) {
                    html.push("<td colspan='3'>Exp:" + data.requestPojo.indexList[i] + "</td>");
                }
                html.push("</tr><tr>");
                for (let i = -1; i < data.requestPojo.indexList.length; i++) {
                    html.push("<td>FC</td><td>Ratio</td><td>PN</td>");
                }
                html.push("</tr></thead><tbody>");
                for (let i = 0; i < data.resultPojoList.length; i++) {
                    html.push("<tr>");
                    html.push("<td>" + data.resultPojoList[i].accession + "</td>");
                    html.push("<td>" + data.resultPojoList[i].description + "</td>");
                    html.push("<td>" + data.resultPojoList[i].geneSymbol + "</td>");
                    html.push("<td>" + data.resultPojoList[i].molecularWeight + "</td>");

                    html.push("<td>" + data.resultPojoList[i]["fc" + data.requestPojo.sampleId] + "</td>");
                    html.push("<td>" + data.resultPojoList[i]["ratio" + data.requestPojo.sampleId] + "</td>");
                    html.push("<td>" + data.resultPojoList[i]["peptideNum" + data.requestPojo.sampleId] + "</td>");

                    for (let j = 0; j < data.requestPojo.indexList.length; j++) {
                        html.push("<td>" + data.resultPojoList[i]["fc" + data.requestPojo.indexList[j]] + "</td>");
                        html.push("<td>" + data.resultPojoList[i]["ratio" + data.requestPojo.indexList[j]] + "</td>");
                        html.push("<td>" + data.resultPojoList[i]["peptideNum" + data.requestPojo.indexList[j]] + "</td>");
                    }
                    html.push("</tr>")
                }
                html.push("</tbody></table>");
                html.push("entryCount: " + pageCount);
                if (pageCount > pageBegin + parseInt(pageLength.value))
                    html.push("<button onclick='nextPage()'>下一页</button>");
                document.getElementById("compareResult").innerHTML = html.join("");
            }
        })
    }
</script>
</html>
