package dp.hgdb.pojo;

import java.util.List;

public class CompareParaTypePojo {

    //需要输出的exp列表，第一个作为sample
    List<Integer> indexList;

    //排序exp id（默认为0,表示不排序）
    Integer sortIndex = 0;

    //排序的方式。值为两种”ASC“正序，”DESC“反序。
    // 当sortIndex = 0时，忽略该值
    // 当sortIndex ！= 0时，必须为”ASC“， ”DESC“其中之一
    String sortType = "";

}
