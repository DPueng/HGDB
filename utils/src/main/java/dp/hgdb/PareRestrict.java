package dp.hgdb;

import java.util.List;

public class PareRestrict {
    public static void pageRestrict(List<Integer> indexList, Integer sampleId,
                                    Integer sortIndex, String sortType,
                                    Double topFoldChange, Double downFoldChange) throws Exception {
        //1,输入数组必须满足idexListRestrict
        //2,sortIndex必须从indexList中第一个以外到其他数字中挑选
        //3,sortType只能有“ASC”——升序，“DESC”——降序两种选择

        //indexList长度判断
        if (indexList.size() < 1)
            throw new Exception("indexList.size() < 1\t" + indexList);
        if (indexList.size() > 4)
            throw new Exception("indexList.size() > 4\t" + indexList);

        //重复判断
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

        //sample必须是除indexList中之外的1-5中的数字
        if (indexList.contains(sampleId)) throw new Exception("sampleId not in indexList \tsampleId: " + sampleId + "\t indexList: " + indexList);
        if(sampleId != 1 && sampleId != 2 && sampleId != 3 && sampleId != 4 &&sampleId != 5)
            throw new Exception("num must in [1, 2, 3, 4, 5]" + sampleId);
        //sortIndex必须是indexList中一个数
        if(!indexList.contains(sortIndex) && sortIndex != 0) throw new Exception("sortIndex must exist in indexList \tsortIndex:" + sortIndex + "\tindexList:" + indexList);
        if( !sortType.equals("ASC")  && !sortType.equals("DESC")) {
            throw new Exception("sortType must equals to 'ASC' or 'DESC'\tsortType:" + sortType );
        }
        //topFoldChange > downFoldChange
        if (downFoldChange > topFoldChange) throw new Exception("topFoldChange must >  downFoldChange \t topFoldChange: " + topFoldChange + "\tdownFoldChange" + downFoldChange);
        if(downFoldChange<0 || downFoldChange > 5 || topFoldChange < 0 || topFoldChange > 5) throw new Exception("topFoldChange, downFoldChange must in [0, 5] \t topFoldChange: " + topFoldChange + "\tdownFoldChange" + downFoldChange );
    }
}
