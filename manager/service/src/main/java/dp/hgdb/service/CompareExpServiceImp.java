package dp.hgdb.service;

import dp.hgdb.mappers.ComparePageMapper;
import dp.hgdb.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

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
    @Override
    public PagePojo initPage(RequestPojo requestPojo) {
        PagePojo pagePojo = new PagePojo();
        List<ResultPojo> resultPojos = comparePageMapper.selectByParaPojo(requestPojo);
        pagePojo.setResultPojoList(resultPojos);
        pagePojo.setRequestPojo(requestPojo);
        return pagePojo;
    }

    @Override
    public Integer entryCount(RequestPojo requestPojo) {
        return comparePageMapper.selectEntryCount(requestPojo);
    }
}