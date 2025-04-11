class Solution {
    public int searchInsert(int[] nums, int target) {
        int x = 0;
        int y = nums.length-1;
        while(x<=y){
            int mid = x+ (y-x)/2;

            if(nums[mid] == target){
                return mid;
            }else if(nums[mid]<target){
                x = mid+1;
            }else{
                y = mid-1;
            }
        }

        return x;
        
    }
}