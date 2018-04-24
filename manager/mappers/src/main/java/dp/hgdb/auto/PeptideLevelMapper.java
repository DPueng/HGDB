package dp.hgdb.auto;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PeptideLevelMapper {
    long countByExample(PeptideLevelExample example);

    int deleteByExample(PeptideLevelExample example);

    int deleteByPrimaryKey(Integer peptideId);

    int insert(PeptideLevel record);

    int insertSelective(PeptideLevel record);

    List<PeptideLevel> selectByExample(PeptideLevelExample example);

    PeptideLevel selectByPrimaryKey(Integer peptideId);

    int updateByExampleSelective(@Param("record") PeptideLevel record, @Param("example") PeptideLevelExample example);

    int updateByExample(@Param("record") PeptideLevel record, @Param("example") PeptideLevelExample example);

    int updateByPrimaryKeySelective(PeptideLevel record);

    int updateByPrimaryKey(PeptideLevel record);
}