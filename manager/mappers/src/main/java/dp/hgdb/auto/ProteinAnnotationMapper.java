package dp.hgdb.auto;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProteinAnnotationMapper {
    long countByExample(ProteinAnnotationExample example);

    int deleteByExample(ProteinAnnotationExample example);

    int deleteByPrimaryKey(String accession);

    int insert(ProteinAnnotation record);

    int insertSelective(ProteinAnnotation record);

    List<ProteinAnnotation> selectByExampleWithBLOBs(ProteinAnnotationExample example);

    List<ProteinAnnotation> selectByExample(ProteinAnnotationExample example);

    ProteinAnnotation selectByPrimaryKey(String accession);

    int updateByExampleSelective(@Param("record") ProteinAnnotation record, @Param("example") ProteinAnnotationExample example);

    int updateByExampleWithBLOBs(@Param("record") ProteinAnnotation record, @Param("example") ProteinAnnotationExample example);

    int updateByExample(@Param("record") ProteinAnnotation record, @Param("example") ProteinAnnotationExample example);

    int updateByPrimaryKeySelective(ProteinAnnotation record);

    int updateByPrimaryKeyWithBLOBs(ProteinAnnotation record);

    int updateByPrimaryKey(ProteinAnnotation record);
}