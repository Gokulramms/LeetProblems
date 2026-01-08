class Solution {
    public int searchInsert(int[] nums, int target) {
        int index=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                index=i;
                break;
            }
            else if(target<nums[i]){
                index=i;
                break;
            }
        }
        if(index==-1){
            return (nums.length);
        }else{
            return index;
        }
    }
}