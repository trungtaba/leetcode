//https://leetcode.com/explore/learn/card/recursion-ii/470/divide-and-conquer/2870/

public class Solution {
    public void quickSort(int [] array) {
        qSort(array, 0, array.length-1);
    }

    private void qSort(int [] array, int lo, int hi){
        int i=partition(array,lo,hi);
        qSort(array,lo,i-1);
        qSort((array), i+1, hi);
    }

    private int partition(int [] array, int lo, int hi){
        int pivot=array[hi];
        int i=lo;
        for (int j = lo; j < hi; ++j){
            if(array[j]<pivot){
                int tmp = array[i];
                array[i]=array[j];
                array[j]=tmp;
                i++;
            }
        }
        int tmp=array[i];
        array[i]=array[hi];
        array[hi]=tmp;
        return i;
    }
}