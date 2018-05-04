package dp.hgdb.pojo;

import java.util.List;

public class PagePojo {


    private List<ResultPojo> resultPojoList;
    private RequestPojo requestPojo;

    public List<ResultPojo> getResultPojoList() {
        return resultPojoList;
    }

    public void setResultPojoList(List<ResultPojo> resultPojoList) {
        this.resultPojoList = resultPojoList;
    }

    public RequestPojo getRequestPojo() {
        return requestPojo;
    }

    public void setRequestPojo(RequestPojo requestPojo) {
        this.requestPojo = requestPojo;
    }

}
