class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] list =new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                list[k++]=nums1[i++];
            }else{
                list[k++]=nums2[j++];
            }
        }
        while(i<m){
            list[k++]=nums1[i++];
        }
        while(j<n){
            list[k++]=nums2[j++];
        }

        if (k%2!=0){
            return list[k/2];
        }else{
            return ((list[k/2]+list[k/2 -1])/2.0);
        }
    }
}