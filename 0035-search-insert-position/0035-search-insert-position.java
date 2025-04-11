class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target<nums[0]){
            return 0;
        }
        int ans = 0;
        int x = 0;
        int y = nums.length-1;
        while(x<=y){
            int mid = x+ (y-x)/2;

            if(nums[mid] == target){
                return mid;
            }else if(nums[mid]<=target){
                if(mid>ans){
                    ans = mid;
                }
                x = mid+1;
            }else{
                y = mid-1;
            }
        }

        return ans+1;
        
    }
}