package dp.hgdb.controller;

import dp.hgdb.PareRestrict;
import dp.hgdb.pojo.PagePojo;
import dp.hgdb.pojo.RequestPojo;
import dp.hgdb.service.CompareExpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;


@Controller
public class CompareExpPageController {

    @Autowired
    private CompareExpService compareExpService;


    @RequestMapping(value = "/init", method = {RequestMethod.GET})
    @ResponseBody
    public PagePojo initPage(String strIndexList, Integer sampleId, Integer sortIndex,
                         String sortType, Integer pageBegin, Integer pageLength,
                         Double topFoldChange, Double downFoldChange) throws Exception {

        ArrayList<Integer> indexList = new ArrayList<>();
        String[] indexArr = strIndexList.split(",");
        for (String index : indexArr) indexList.add(Integer.parseInt(index));
        indexList.remove(sampleId);

        RequestPojo requestPojo = new RequestPojo();
        requestPojo.setIndexList(indexList);
        requestPojo.setSampleId(sampleId);
        requestPojo.setSortIndex(sortIndex);
        requestPojo.setSortType(sortType);
        requestPojo.setPageBegin(pageBegin);
        requestPojo.setPageLength(pageLength);
        requestPojo.setTopFoldChange(topFoldChange);
        requestPojo.setDownFoldChange(downFoldChange);

        PareRestrict.pageRestrict(indexList, sampleId, sortIndex, sortType,topFoldChange, downFoldChange);


        return compareExpService.initPage(requestPojo);
    }

    @RequestMapping("/")
    public String showIndex() {
        return "index";
    }

    @RequestMapping("/entryCount")
    @ResponseBody
    public Integer entryCount(String strIndexList, Integer sampleId, Integer sortIndex,
                              String sortType, Integer pageBegin, Integer pageLength,
                              Double topFoldChange, Double downFoldChange) throws Exception{

        ArrayList<Integer> indexList = new ArrayList<>();
        String[] indexArr = strIndexList.split(",");
        for (String index : indexArr) indexList.add(Integer.parseInt(index));
        indexList.remove(sampleId);

        RequestPojo requestPojo = new RequestPojo();
        requestPojo.setIndexList(indexList);
        requestPojo.setSampleId(sampleId);
        requestPojo.setSortIndex(sortIndex);
        requestPojo.setSortType(sortType);
        requestPojo.setPageBegin(pageBegin);
        requestPojo.setPageLength(pageLength);
        requestPojo.setTopFoldChange(topFoldChange);
        requestPojo.setDownFoldChange(downFoldChange);

        PareRestrict.pageRestrict(indexList, sampleId, sortIndex, sortType,topFoldChange, downFoldChange);

        return compareExpService.entryCount(requestPojo);
    }
}
