package dp.hgdb.auto;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProteinLevelMapper {
    long countByExample(ProteinLevelExample example);

    int deleteByExample(ProteinLevelExample example);

    int deleteByPrimaryKey(Integer proteinId);

    int insert(ProteinLevel record);

    int insertSelective(ProteinLevel record);

    List<ProteinLevel> selectByExample(ProteinLevelExample example);

    ProteinLevel selectByPrimaryKey(Integer proteinId);

    int updateByExampleSelective(@Param("record") ProteinLevel record, @Param("example") ProteinLevelExample example);

    int updateByExample(@Param("record") ProteinLevel record, @Param("example") ProteinLevelExample example);

    int updateByPrimaryKeySelective(ProteinLevel record);

    int updateByPrimaryKey(ProteinLevel record);
}