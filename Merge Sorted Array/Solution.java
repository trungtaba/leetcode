//https://leetcode.com/explore/featured/card/top-interview-questions-easy/96/sorting-and-searching/587/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[]result=new int[n+m];
        int index=0;
        int index1=0;
        int index2=0;
        
        while(index1<m && index2<n){
            if(nums1[index1]<nums2[index2]){
                result[index++]=nums1[index1++];
            }else{
                result[index++]=nums2[index2++];
            }
        }
        
        while(index1<m){
            result[index++]=nums1[index1++];
        }
        
        while(index2<n){
            result[index++]=nums2[index2++];
        }
        
        for(int i=0;i<m+n;i++){
            nums1[i]=result[i];
        }
    }
}