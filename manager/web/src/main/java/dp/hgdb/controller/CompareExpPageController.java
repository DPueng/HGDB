package dp.hgdb.controller;

import dp.hgdb.PareRestrict;
import dp.hgdb.pojo.ExpPojo;
import dp.hgdb.pojo.PagePojo;
import dp.hgdb.service.CompareExpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CompareExpPageController {

    @Autowired
    private CompareExpService compareExpService;


    private List<Integer> indexList = new ArrayList<>();

    @RequestMapping(value = "/init", method = {RequestMethod.GET})
    @ResponseBody
    public PagePojo initPage(String strIndexList) throws Exception {
        //切分组装indexList
        String[] split = strIndexList.split(",");
        ArrayList<Integer> indexList = new ArrayList<>();
        for (String s : split)
            indexList.add(Integer.parseInt(s));
        //这里需要对输入数组添加约束：
        //1,所有数字必须在1,2,3,4,5之中
        //2,所有数字不能重复
        //3,数字个数必须大于等于2
        PareRestrict.indexListRestrict(indexList);
        PagePojo pagePojo = compareExpService.initPage(indexList);
        this.indexList = indexList;
        return pagePojo;
    }


    @RequestMapping("/sort")
    public void sortPage() throws Exception {
        ArrayList<Integer> indexList = new ArrayList<>();
        indexList.add(2);
        indexList.add(3);
        indexList.add(1);
        Integer sortIndex = 1;
        String sortType = "DESC";
        //1,输入数组必须满足idexListRestrict
        //2,sortIndex必须从indexList中第一个以外到其他数字中挑选
        //3,sortType只能有“ASC”——升序，“DESC”——降序两种选择
        PareRestrict.sortRestrict(indexList, sortIndex, sortType);
        PagePojo pagePojo = compareExpService.sortByExpFC(indexList, sortIndex, sortType);
        System.out.println("success");
    }

    @RequestMapping("/add")
    public void addExpData() throws Exception {
        int addIndex = 4;
        //1,不得与indexList中编号重复
        //2，必须在[1, 2, 3, 4, 5]之中
        PareRestrict.addRestrict(indexList, addIndex);
        List<ExpPojo> expPojos = compareExpService.addExpData(addIndex);
        System.out.println("successsssssss");
    }
}
