package dp.hgdb.mappers;

import dp.hgdb.pojo.AnnoPojo;
import dp.hgdb.pojo.ExpPojo;

import java.util.List;

public interface ComparePageMapper {
    public List<AnnoPojo> selectAnno();

    /**
     * @param ExpId = 1,2,3,4,5
     * @return
     */
    public List<ExpPojo> selectByExpID(Integer ExpId);
}
