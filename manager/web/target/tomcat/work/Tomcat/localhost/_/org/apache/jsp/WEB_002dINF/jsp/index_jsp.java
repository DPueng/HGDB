/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-05-04 02:46:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>index</title>\n");
      out.write("        <script src=\"https://cdn.bootcss.com/jquery/1.12.4/jquery.js\"></script>\n");
      out.write("    </head>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"selector\">\n");
      out.write("    选择需要展示的expId： <br>\n");
      out.write("    1:<input type=\"checkbox\" class=\"indexList\"/>\n");
      out.write("    2:<input type=\"checkbox\" class=\"indexList\"/>\n");
      out.write("    3:<input type=\"checkbox\" class=\"indexList\"/>\n");
      out.write("    4:<input type=\"checkbox\" class=\"indexList\"/>\n");
      out.write("    5:<input type=\"checkbox\" class=\"indexList\"/>\n");
      out.write("    选取的expId:\n");
      out.write("    <span class=\"selectedIndexList\"></span><br>\n");
      out.write("\n");
      out.write("    选择sampleId:\n");
      out.write("    <select class=\"selectSampleId\">\n");
      out.write("\n");
      out.write("    </select><br>\n");
      out.write("\n");
      out.write("    选择sortId:\n");
      out.write("    <select class=\"selectSortId\">\n");
      out.write("    </select>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <select class=\"sortType\">\n");
      out.write("        <option>ASC</option>\n");
      out.write("        <option>DESC</option>\n");
      out.write("    </select><br>\n");
      out.write("    FoldChange: <input type=\"text\" class=\"downFoldChange\" value=\"2.50\"/> ~ <input type=\"text\" class=\"topFoldChange\" value=\"2.50\"/><br>\n");
      out.write("    pageLength: <input type=\"text\" class=\"pageLength\" value=\"30\"/><br>\n");
      out.write("    <button onclick=\"commit()\">提交</button>\n");
      out.write("</div>\n");
      out.write("<div id=\"compareResult\">\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    $(function () {\n");
      out.write("        let indexListSelectors = document.querySelectorAll(\".indexList\");\n");
      out.write("        let selectedIndexList = document.querySelector(\".selectedIndexList\");\n");
      out.write("        let selectSampleId = document.querySelector(\".selectSampleId\");\n");
      out.write("        let selectSortId = document.querySelector(\".selectSortId\");\n");
      out.write("        let indexList = [];\n");
      out.write("        for (let i = 0; i < indexListSelectors.length; i++) {\n");
      out.write("            indexListSelectors[i].index = i + 1;\n");
      out.write("            indexListSelectors[i].onchange = function () {\n");
      out.write("                // 展示选取的expId\n");
      out.write("                if (this.checked) {\n");
      out.write("                    indexList.push(this.index)\n");
      out.write("                } else {\n");
      out.write("                    let sendIndex = indexList.indexOf(this.index);\n");
      out.write("                    indexList.splice(sendIndex, 1);\n");
      out.write("                }\n");
      out.write("                selectedIndexList.innerHTML = indexList.join(',');\n");
      out.write("\n");
      out.write("                // 根据选择的expId生成可选择的sampleId\n");
      out.write("                let htmlSelect = \"<option>0</option>\";\n");
      out.write("                for (let i = 0; i < indexList.length; i++) {\n");
      out.write("                    htmlSelect += '<option>' + indexList[i] + '</option>'\n");
      out.write("                }\n");
      out.write("                selectSampleId.innerHTML = htmlSelect;\n");
      out.write("                selectSampleId.onchange = function () {\n");
      out.write("                    htmlSelect = \"<option>0</option>\";\n");
      out.write("                    for (let i = 0; i < indexList.length; i++) {\n");
      out.write("                        if (indexList[i] != selectSampleId.value) {\n");
      out.write("                            htmlSelect += '<option>' + indexList[i] + '</option>'\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                    selectSortId.innerHTML = htmlSelect;\n");
      out.write("                };\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    function commit() {\n");
      out.write("        pageBegin = 0;\n");
      out.write("\n");
      out.write("        let indexListDoc = document.querySelectorAll('.indexList');\n");
      out.write("        let indexList = [];\n");
      out.write("        for (let i = 0; i < indexListDoc.length; i++) {\n");
      out.write("            if (indexListDoc[i].checked) {\n");
      out.write("                indexList.push(indexListDoc[i].index);\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        let sampleId = document.querySelector(\".selectSampleId\");\n");
      out.write("        let sortId = document.querySelector(\".selectSortId\");\n");
      out.write("        let sortType = document.querySelector(\".sortType\");\n");
      out.write("        let topFoldChange = document.querySelector(\".topFoldChange\");\n");
      out.write("        let downFoldChange = document.querySelector(\".downFoldChange\");\n");
      out.write("        let pageLength = document.querySelector(\".pageLength\");\n");
      out.write("\n");
      out.write("        let jsonData = {\n");
      out.write("            'strIndexList': indexList.join(\",\"),\n");
      out.write("            'sampleId': sampleId.value,\n");
      out.write("            'sortIndex': sortId.value,\n");
      out.write("            'sortType': sortType.value,\n");
      out.write("            'pageBegin': pageBegin,\n");
      out.write("            'pageLength': pageLength.value,\n");
      out.write("            'topFoldChange': topFoldChange.value,\n");
      out.write("            'downFoldChange': downFoldChange.value\n");
      out.write("        };\n");
      out.write("\n");
      out.write("        $.ajax({\n");
      out.write("            type: 'get',\n");
      out.write("            dataType: 'JSON',\n");
      out.write("            data: jsonData,\n");
      out.write("            url: 'http://localhost:8080/entryCount',\n");
      out.write("            success: function (data) {\n");
      out.write("                pageCount = data;\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $.ajax({\n");
      out.write("            type: 'get',\n");
      out.write("            dataType: 'JSON',\n");
      out.write("            data: jsonData,\n");
      out.write("            url: 'http://localhost:8080/init',\n");
      out.write("            success: function (data) {\n");
      out.write("                let html = [];\n");
      out.write("                html.push(\"<table border='1px' cellspacing=0 cellpadding=0><thead><tr><td rowspan='2'>ProteinID</td><td rowspan='2'>Symbol</td> <td rowspan='2'>Description</td> <td rowspan='2'>MW(kDa)</td>\");\n");
      out.write("                html.push(\"<td colspan='3'>sample exp:\" + data.requestPojo.sampleId + \"</td>\");\n");
      out.write("                for (let i = 0; i < data.requestPojo.indexList.length; i++) {\n");
      out.write("                    html.push(\"<td colspan='3'>Exp:\" + data.requestPojo.indexList[i] + \"</td>\");\n");
      out.write("                }\n");
      out.write("                html.push(\"</tr><tr>\");\n");
      out.write("                for (let i = -1; i < data.requestPojo.indexList.length; i++) {\n");
      out.write("                    html.push(\"<td>FC</td><td>Ratio</td><td>PN</td>\");\n");
      out.write("                }\n");
      out.write("                html.push(\"</tr></thead><tbody>\");\n");
      out.write("                for (let i = 0; i < data.resultPojoList.length; i++) {\n");
      out.write("                    html.push(\"<tr>\");\n");
      out.write("                    html.push(\"<td>\" + data.resultPojoList[i].accession + \"</td>\");\n");
      out.write("                    html.push(\"<td>\" + data.resultPojoList[i].description + \"</td>\");\n");
      out.write("                    html.push(\"<td>\" + data.resultPojoList[i].geneSymbol + \"</td>\");\n");
      out.write("                    html.push(\"<td>\" + data.resultPojoList[i].molecularWeight + \"</td>\");\n");
      out.write("\n");
      out.write("                    html.push(\"<td>\" + data.resultPojoList[i][\"fc\" + data.requestPojo.sampleId] + \"</td>\");\n");
      out.write("                    html.push(\"<td>\" + data.resultPojoList[i][\"ratio\" + data.requestPojo.sampleId] + \"</td>\");\n");
      out.write("                    html.push(\"<td>\" + data.resultPojoList[i][\"peptideNum\" + data.requestPojo.sampleId] + \"</td>\");\n");
      out.write("\n");
      out.write("                    for (let j = 0; j < data.requestPojo.indexList.length; j++) {\n");
      out.write("                        html.push(\"<td>\" + data.resultPojoList[i][\"fc\" + data.requestPojo.indexList[j]] + \"</td>\");\n");
      out.write("                        html.push(\"<td>\" + data.resultPojoList[i][\"ratio\" + data.requestPojo.indexList[j]] + \"</td>\");\n");
      out.write("                        html.push(\"<td>\" + data.resultPojoList[i][\"peptideNum\" + data.requestPojo.indexList[j]] + \"</td>\");\n");
      out.write("                    }\n");
      out.write("                    html.push(\"</tr>\")\n");
      out.write("                }\n");
      out.write("                html.push(\"</tbody></table>\");\n");
      out.write("                html.push(\"entryCount: \" + pageCount);\n");
      out.write("                if (pageCount > pageBegin + parseInt(pageLength.value))\n");
      out.write("                    html.push(\"<button onclick='nextPage()'>下一页</button>\");\n");
      out.write("                document.getElementById(\"compareResult\").innerHTML = html.join(\"\");\n");
      out.write("            }\n");
      out.write("        })\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function nextPage() {\n");
      out.write("        let indexListDoc = document.querySelectorAll('.indexList');\n");
      out.write("        let indexList = [];\n");
      out.write("        for (let i = 0; i < indexListDoc.length; i++) {\n");
      out.write("            if (indexListDoc[i].checked) {\n");
      out.write("                indexList.push(indexListDoc[i].index);\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        let sampleId = document.querySelector(\".selectSampleId\");\n");
      out.write("        let sortId = document.querySelector(\".selectSortId\");\n");
      out.write("        let sortType = document.querySelector(\".sortType\");\n");
      out.write("        let topFoldChange = document.querySelector(\".topFoldChange\");\n");
      out.write("        let downFoldChange = document.querySelector(\".downFoldChange\");\n");
      out.write("        let pageLength = document.querySelector(\".pageLength\");\n");
      out.write("\n");
      out.write("        pageBegin += parseInt(pageLength.value);\n");
      out.write("        let jsonData = {\n");
      out.write("            'strIndexList': indexList.join(\",\"),\n");
      out.write("            'sampleId': sampleId.value,\n");
      out.write("            'sortIndex': sortId.value,\n");
      out.write("            'sortType': sortType.value,\n");
      out.write("            'pageBegin': pageBegin,\n");
      out.write("            'pageLength': pageLength.value,\n");
      out.write("            'topFoldChange': topFoldChange.value,\n");
      out.write("            'downFoldChange': downFoldChange.value\n");
      out.write("        };\n");
      out.write("\n");
      out.write("        console.log(jsonData);\n");
      out.write("\n");
      out.write("        $.ajax({\n");
      out.write("            type: 'get',\n");
      out.write("            dataType: 'JSON',\n");
      out.write("            data: jsonData,\n");
      out.write("            url: 'http://localhost:8080/init',\n");
      out.write("            success: function (data) {\n");
      out.write("                let html = [];\n");
      out.write("                html.push(\"<table border='1px' cellspacing=0 cellpadding=0><thead><tr><td rowspan='2'>ProteinID</td><td rowspan='2'>Symbol</td> <td rowspan='2'>Description</td> <td rowspan='2'>MW(kDa)</td>\");\n");
      out.write("                html.push(\"<td colspan='3'>sample exp:\" + data.requestPojo.sampleId + \"</td>\");\n");
      out.write("                for (let i = 0; i < data.requestPojo.indexList.length; i++) {\n");
      out.write("                    html.push(\"<td colspan='3'>Exp:\" + data.requestPojo.indexList[i] + \"</td>\");\n");
      out.write("                }\n");
      out.write("                html.push(\"</tr><tr>\");\n");
      out.write("                for (let i = -1; i < data.requestPojo.indexList.length; i++) {\n");
      out.write("                    html.push(\"<td>FC</td><td>Ratio</td><td>PN</td>\");\n");
      out.write("                }\n");
      out.write("                html.push(\"</tr></thead><tbody>\");\n");
      out.write("                for (let i = 0; i < data.resultPojoList.length; i++) {\n");
      out.write("                    html.push(\"<tr>\");\n");
      out.write("                    html.push(\"<td>\" + data.resultPojoList[i].accession + \"</td>\");\n");
      out.write("                    html.push(\"<td>\" + data.resultPojoList[i].description + \"</td>\");\n");
      out.write("                    html.push(\"<td>\" + data.resultPojoList[i].geneSymbol + \"</td>\");\n");
      out.write("                    html.push(\"<td>\" + data.resultPojoList[i].molecularWeight + \"</td>\");\n");
      out.write("\n");
      out.write("                    html.push(\"<td>\" + data.resultPojoList[i][\"fc\" + data.requestPojo.sampleId] + \"</td>\");\n");
      out.write("                    html.push(\"<td>\" + data.resultPojoList[i][\"ratio\" + data.requestPojo.sampleId] + \"</td>\");\n");
      out.write("                    html.push(\"<td>\" + data.resultPojoList[i][\"peptideNum\" + data.requestPojo.sampleId] + \"</td>\");\n");
      out.write("\n");
      out.write("                    for (let j = 0; j < data.requestPojo.indexList.length; j++) {\n");
      out.write("                        html.push(\"<td>\" + data.resultPojoList[i][\"fc\" + data.requestPojo.indexList[j]] + \"</td>\");\n");
      out.write("                        html.push(\"<td>\" + data.resultPojoList[i][\"ratio\" + data.requestPojo.indexList[j]] + \"</td>\");\n");
      out.write("                        html.push(\"<td>\" + data.resultPojoList[i][\"peptideNum\" + data.requestPojo.indexList[j]] + \"</td>\");\n");
      out.write("                    }\n");
      out.write("                    html.push(\"</tr>\")\n");
      out.write("                }\n");
      out.write("                html.push(\"</tbody></table>\");\n");
      out.write("                html.push(\"entryCount: \" + pageCount);\n");
      out.write("                if (pageCount > pageBegin + parseInt(pageLength.value))\n");
      out.write("                    html.push(\"<button onclick='nextPage()'>下一页</button>\");\n");
      out.write("                document.getElementById(\"compareResult\").innerHTML = html.join(\"\");\n");
      out.write("            }\n");
      out.write("        })\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}