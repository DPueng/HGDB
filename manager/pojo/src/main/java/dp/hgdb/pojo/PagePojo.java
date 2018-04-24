package dp.hgdb.pojo;

import java.util.List;

/**
 * 初始化頁面時（第一次加載頁面或者排序后返回结果）
 */

public class PagePojo {
    private List<AnnoPojo> annoPojo;
    private List<List<ExpPojo>> list;

    public List<AnnoPojo> getAnnoPojo() {
        return annoPojo;
    }

    public void setAnnoPojo(List<AnnoPojo> annoPojo) {
        this.annoPojo = annoPojo;
    }

    public List<List<ExpPojo>> getList() {
        return list;
    }

    public void setList(List<List<ExpPojo>> list) {
        this.list = list;
    }
}
