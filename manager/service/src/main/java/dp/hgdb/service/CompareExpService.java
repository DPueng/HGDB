package dp.hgdb.service;

import dp.hgdb.pojo.PagePojo;
import dp.hgdb.pojo.RequestPojo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CompareExpService {
    /**
     * 提供初始化界面数据
     */
    public PagePojo initPage(RequestPojo requestPojo);

    public Integer entryCount(RequestPojo requestPojo);
}
