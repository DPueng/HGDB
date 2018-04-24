package dp.hgdb.service;

import dp.hgdb.pojo.ExpPojo;
import dp.hgdb.pojo.PagePojo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CompareExpService {
    /**
     * 提供初始化界面数据
     * @param indexList 选择需要展示到实验号，按照list顺序依次展示，listIndex = 0到exp作为sample
     * @param sortIndex 按照某一个exp的fc值进行排序。
     *                 约束：sortIndex = 0时，不排序。
     *                      sortIndex = indexList[0]时，不排序
     * @param sortType 排序方式，升序“ASC”，降序“DESC”。当第二参数获得结果为不排序时sortType参数
     * @return
     */
    public PagePojo sortByExpFC(List<Integer> indexList, Integer sortIndex, String sortType);

    /**
     * 提供初始化界面数据
     * @param indexList 选择需要展示到实验号，按照list顺序依次展示，listIndex = 0到exp作为sample,不排序
     */
    public PagePojo initPage(List<Integer> indexList);

    /**
     * 单独提供某一个实验的数据（排序后）
     * @param addIndex 新添加的实验id
     */
    public List<ExpPojo> addExpData(Integer addIndex);

}
