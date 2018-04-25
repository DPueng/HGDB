package dp.hgdb.service;

import dp.hgdb.mappers.ComparePageMapper;
import dp.hgdb.pojo.AnnoPojo;
import dp.hgdb.pojo.ExpPojo;
import dp.hgdb.pojo.PagePojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import static dp.hgdb.utils.CompareExpUtils.*;

@Service
public class CompareExpServiceImp implements CompareExpService {

    @Autowired
    private ComparePageMapper comparePageMapper;
    /**
     * 在内存中对accesion顺序进行存储。两个应用场景
     * 1,排序：
     *      1）对选中exp data进行排序
     *      2）根据完成排序的exp data，获取顺序信息
     *      3)分别对其余exp data和anno data进行 排序
     *
     * 2,动态添加exp data
     */
    private List<ExpPojo> accessionOrder = new ArrayList<>();

    @Override
    public PagePojo sortByExpFC(List<Integer> indexList, Integer sortIndex, String sortType) {
        /**
         * 通过initPage方法获得初始化页面
         * 考虑添加分页后，数据量不会很大
         * 选择重新从数据库获取数据
         *  不采用在内存中保留pagePojo的方法
         */
        PagePojo pagePojo = initPage(indexList);
        //获得排序exp data
        List<ExpPojo> sortList = pagePojo.getList().get(indexList.indexOf(sortIndex));
        //对排序exp data进行操作
        if (sortType == "ASC")
            quickSortExpDataASC(sortList, 0, sortList.size() - 1);
        else if (sortType == "DESC")
            quickSortExpDataDESC(sortList, 0, sortList.size() - 1);
        //刷新order
        accessionOrder = sortList;

        //按照accessionOrder对annoData进行排序
        List<AnnoPojo> newAnnoPojo = sortAnnoByAccessionOrder(accessionOrder, pagePojo.getAnnoPojo());

        //按照accessionOrder对exp data进行排序
        ArrayList<List<ExpPojo>> newExpData = new ArrayList<>();
        for (int i = 0; i < indexList.size(); i++) {
            if (indexList.get(i) == sortIndex) {
                newExpData.add(sortList);
                continue;
            }
            /**
             * 循环获取0-indexList.size()
             * 将pagepojo中的exp data除被排序数据外依次放入sort方法，获得排序后data
             * 将排序后数据置入新的pagePojo
             */
            newExpData.add(sortExpByAccessionOrder(accessionOrder, pagePojo.getList().get(i)));
        }
        //组装排序后到pagePojo
        PagePojo newPagePojo = new PagePojo();
        newPagePojo.setAnnoPojo(newAnnoPojo);
        newPagePojo.setList(newExpData);
        return newPagePojo;
    }

    @Override
    public PagePojo initPage(List<Integer> indexList) {
        PagePojo pagePojo = new PagePojo();
        //获取annotion数据，并置入pagePojo
        List<AnnoPojo> annoPojos = comparePageMapper.selectAnno();
        pagePojo.setAnnoPojo(annoPojos);

        //获取sample Exp data
        List<ExpPojo> expPojos1 = comparePageMapper.selectByExpID(indexList.get(0));
        //刷新order数据
        accessionOrder = expPojos1;
        //将sample Exp data 的 accession与Ratio存入hashMap以供对比数据生成FC
        HashMap<String, BigDecimal> stringBigDecimalHashMap = new HashMap<>();
        for (ExpPojo expPojo : expPojos1) {
            stringBigDecimalHashMap.put(expPojo.getAccession(), expPojo.getRatio());
        }

        //创建exp data数组到容器，并预先置入sample  data
        ArrayList<List<ExpPojo>> lists = new ArrayList<>();
        lists.add(expPojos1);

        //循环置入对比exp data
        Iterator<Integer> iterator = indexList.iterator();
        iterator.next();
        while (iterator.hasNext()) {
            Integer ExpId = iterator.next();
            List<ExpPojo> expPojos = comparePageMapper.selectByExpID(ExpId);
            //计算FC
            for (ExpPojo expPojo : expPojos)
                expPojo.setFC(stringBigDecimalHashMap.get(expPojo.getAccession()).divide(expPojo.getRatio(), 6, BigDecimal.ROUND_HALF_UP).doubleValue());
            lists.add(expPojos);
        }
        pagePojo.setList(lists);
        return pagePojo;
    }

    @Override
    public List<ExpPojo> addExpData(Integer addIndex) {
        //根据指定index获取实验数据
        List<ExpPojo> expPojos = comparePageMapper.selectByExpID(addIndex);
        //将sample Exp data 的 accession与Ratio存入hashMap以供对比数据生成FC
        HashMap<String, BigDecimal> stringBigDecimalHashMap = new HashMap<>();
        for (ExpPojo expPojo : accessionOrder)
            stringBigDecimalHashMap.put(expPojo.getAccession(), expPojo.getRatio());
        //生成FC值
        for (ExpPojo expPojo : expPojos)
            expPojo.setFC(stringBigDecimalHashMap.get(expPojo.getAccession()).divide(expPojo.getRatio(), 6, BigDecimal.ROUND_HALF_UP).doubleValue());
        //重排并返回
        return sortExpByAccessionOrder(accessionOrder, expPojos);
    }


}