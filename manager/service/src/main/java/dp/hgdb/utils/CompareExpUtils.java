package dp.hgdb.utils;

import dp.hgdb.pojo.AnnoPojo;
import dp.hgdb.pojo.ExpPojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class CompareExpUtils {

    public static void quickSortExpDataASC(List<ExpPojo> arr, int low, int high) {
        if (arr.size() <= 0) return;
        if (low >= high) return;
        int left = low;
        int right = high;
        ExpPojo temp = arr.get(left);   //挖坑1：保存基准的值

        while (left < right) {
            while (left < right && arr.get(right).getFC() >= temp.getFC()) {  //坑2：从后向前找到比基准小的元素，插入到基准位置坑1中
                right--;
            }
            arr.set(left, arr.get(right));
            while (left < right && arr.get(left).getFC() <= temp.getFC()) {   //坑3：从前往后找到比基准大的元素，放到刚才挖的坑2中
                left++;
            }
            arr.set(right, arr.get(left));
        }

        arr.set(left, temp);   //基准值填补到坑3中，准备分治递归快排
        quickSortExpDataASC(arr, low, left - 1);
        quickSortExpDataASC(arr, left + 1, high);
    }
    public static void quickSortExpDataDESC(List<ExpPojo> arr, int low, int high) {
        if (arr.size() <= 0) return;
        if (low >= high) return;
        int left = low;
        int right = high;
        ExpPojo temp = arr.get(left);   //挖坑1：保存基准的值

        while (left < right) {
            while (left < right && arr.get(right).getFC() <= temp.getFC()) {  //坑2：从后向前找到比基准小的元素，插入到基准位置坑1中
                right--;
            }
            arr.set(left, arr.get(right));
            while (left < right && arr.get(left).getFC() >= temp.getFC()) {   //坑3：从前往后找到比基准大的元素，放到刚才挖的坑2中
                left++;
            }
            arr.set(right, arr.get(left));
        }

        arr.set(left, temp);   //基准值填补到坑3中，准备分治递归快排
        quickSortExpDataDESC(arr, low, left - 1);
        quickSortExpDataDESC(arr, left + 1, high);
    }

    public static List<AnnoPojo> sortAnnoByAccessionOrder(List<ExpPojo> accessionOrder, List<AnnoPojo> annoPojos) {
        //创建供返回到新数组
        List<AnnoPojo> newAnnoPojos = new ArrayList<>();
        //将旧数组放入hashmap以待使用
        HashMap<String, AnnoPojo> stringAnnoPojoHashMap = new HashMap<>();
        Iterator<AnnoPojo> iterator = annoPojos.iterator();
        while (iterator.hasNext()) {
            AnnoPojo next = iterator.next();
            stringAnnoPojoHashMap.put(next.getAccession(), next);
        }
        //按照accessionOrder的顺序将数据压入新数组
        Iterator<ExpPojo> orderIterator = accessionOrder.iterator();
        while (orderIterator.hasNext()){
            ExpPojo next = orderIterator.next();
            newAnnoPojos.add(stringAnnoPojoHashMap.get(next.getAccession()));
        }
        return newAnnoPojos;
    }
    public static List<ExpPojo> sortExpByAccessionOrder(List<ExpPojo> accessionOrder, List<ExpPojo> expPojos) {
        //创建供返回到新数组
        List<ExpPojo> newExpPojos = new ArrayList<>();
        //将旧数组放入hashmap以待使用
        HashMap<String, ExpPojo> stringExpPojoHashMap = new HashMap<String, ExpPojo>();
        Iterator<ExpPojo> iterator = expPojos.iterator();
        while (iterator.hasNext()) {
            ExpPojo next = iterator.next();
            stringExpPojoHashMap.put(next.getAccession(), next);
        }
        //按照accessionOrder的顺序将数据压入新数组
        Iterator<ExpPojo> orderIterator = accessionOrder.iterator();
        while (orderIterator.hasNext()){
            ExpPojo next = orderIterator.next();
            newExpPojos.add(stringExpPojoHashMap.get(next.getAccession()));
        }
        return newExpPojos;
    }

}
