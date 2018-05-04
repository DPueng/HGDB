package dp.hgdb.pojo;

import java.util.List;

public class CompareParaTypePojo {

    //在拼接sql时使用，方便
    //在生成indexList后，将indexList置入查询参数时
    //删除list[0],并置入indexSample
    private Integer indexSample;

    //需要输出的exp列表，第一个作为sample
    private List<Integer> indexList;

    //排序exp id（默认为0,表示不排序）
    private Integer sortIndex = 0;

    //排序的方式。值为两种”ASC“正序，”DESC“反序。
    // 当sortIndex = 0时，忽略该值
    // 当sortIndex ！= 0时，必须为”ASC“， ”DESC“其中之一
    private String sortType = "";

//    分页数据
    private Integer pageBegin;
    private Integer pageLength;



    public Integer getIndexSample() {
        return indexSample;
    }

    public void setIndexSample(Integer indexSample) {
        this.indexSample = indexSample;
    }

    public List<Integer> getIndexList() {
        return indexList;
    }

    public void setIndexList(List<Integer> indexList) {
        this.indexList = indexList;
        indexList.remove(indexSample);
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
}
