package dp.hgdb.controller;

import dp.hgdb.PareRestrict;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> indexList = new ArrayList<>();
        indexList.add(1);
        indexList.add(2);
        indexList.add(3);
        int sortIndex = 2;
        String sortType = "ASC";
        //这里需要对输入数组添加约束：
        //1,所有数字必须在1,2,3,4,5之中
        //2,所有数字不能重复
        //3,数字个数必须大于等于2
        System.out.println(indexList.contains(sortIndex));
        PareRestrict.sortRestrict(indexList, sortIndex, sortType);
        System.out.println("RESTRICT");
    }
}
