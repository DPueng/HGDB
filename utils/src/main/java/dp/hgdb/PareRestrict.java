package dp.hgdb;

import java.util.List;

public class PareRestrict {

    public static void indexListRestrict(List<Integer> indexList) throws Exception {
        //1,所有数字必须在1,2,3,4,5之中
        //2,所有数字不能重复
        //3,数字个数必须大于等于2

        //长度判断
        if (indexList.size() < 2)
            throw new Exception("indexList.size() < 2\t" + indexList);
        if (indexList.size() > 5)
            throw new Exception("indexList.size() > 5\t" + indexList);
        for (int i = 0; i < indexList.size() - 1; i++) {
            //必须在[1, 5]
            if(indexList.get(i) != 1 && indexList.get(i) != 2 && indexList.get(i) != 3 && indexList.get(i) != 4 &&indexList.get(i) != 5)
                throw new Exception("num must in [1, 2, 3, 4, 5]" + indexList);
            for (int j = i + 1; j < indexList.size(); j++) {
                //重复判断
                if (indexList.get(i) == indexList.get(j))
                    throw new Exception("same index\t" + indexList);
            }
        }
    }
    public static void sortRestrict(List<Integer> indexList, Integer sortIndex, String sortType) throws Exception {
        //1,输入数组必须满足idexListRestrict
        //2,sortIndex必须从indexList中第一个以外到其他数字中挑选
        //3,sortType只能有“ASC”——升序，“DESC”——降序两种选择
        indexListRestrict(indexList);
        if(sortIndex == indexList.get(0)) throw new Exception("sortIndex != sample index \tsortIndex:" + sortIndex + "\tindexList:" + indexList);
        if(!indexList.contains(sortIndex)) throw new Exception("sortIndex must exist in indexList \tsortIndex:" + sortIndex + "\tindexList:" + indexList);
        if(sortType != "ASC" && sortType != "DESC") throw new Exception("sortType must equals to 'ASC' or 'DESC'\tsortType:" + sortType );
    }

    public static void addRestrict(List<Integer> indexList, Integer addIndex) throws Exception {
        //1,不得与indexList中编号重复
        //2，必须在[1, 2, 3, 4, 5]之中
        if(indexList.contains(addIndex)) throw new Exception("Add Exp must a new Exp\tindexList:" + indexList + "\taddIndex:" + addIndex);
        if (addIndex != 1 && addIndex != 2 && addIndex != 3 && addIndex != 4 && addIndex != 5)
            throw new Exception("Exp id must in [1, 2, 3, 4, 5]\taddIndex:" + addIndex);
    }

}
