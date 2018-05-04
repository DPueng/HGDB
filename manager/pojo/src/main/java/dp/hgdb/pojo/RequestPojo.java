package dp.hgdb.pojo;

import java.util.Arrays;
import java.util.List;

public class RequestPojo {

    private List<Integer> IndexList;
    private Integer sampleId;
    private Integer sortIndex;
    private String sortType;
    private Integer pageBegin;
    private Integer pageLength;
    private Double topFoldChange;
    private Double downFoldChange;

    public List<Integer> getIndexList() {
        return IndexList;
    }

    public void setIndexList(List<Integer> indexList) {
        IndexList = indexList;
    }

    public Integer getSampleId() {
        return sampleId;
    }

    public void setSampleId(Integer sampleId) {
        this.sampleId = sampleId;
    }

    public Integer getSortIndex() {
        return sortIndex;
    }

    public void setSortIndex(Integer sortIndex) {
        this.sortIndex = sortIndex;
    }

    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    public Integer getPageBegin() {
        return pageBegin;
    }

    public void setPageBegin(Integer pageBegin) {
        this.pageBegin = pageBegin;
    }

    public Integer getPageLength() {
        return pageLength;
    }

    public void setPageLength(Integer pageLength) {
        this.pageLength = pageLength;
    }

    public Double getTopFoldChange() {
        return topFoldChange;
    }

    public void setTopFoldChange(Double topFoldChange) {
        this.topFoldChange = topFoldChange;
    }

    public Double getDownFoldChange() {
        return downFoldChange;
    }

    public void setDownFoldChange(Double downFoldChange) {
        this.downFoldChange = downFoldChange;
    }
}
