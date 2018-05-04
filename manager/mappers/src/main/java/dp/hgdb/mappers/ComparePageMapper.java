package dp.hgdb.mappers;

import dp.hgdb.pojo.*;

import java.util.List;

public interface ComparePageMapper {
    public List<ResultPojo> selectByParaPojo(RequestPojo requestPojo);

    public Integer selectEntryCount(RequestPojo requestPojo);
}
