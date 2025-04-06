class Solution {
    public int singleNumber(int[] nums) {
        for(int i =0; i<nums.length;i++){
            int digit = nums[i];
            int count = 0;

            for(int j = 0;j<nums.length;j++){
                if(nums[j] == digit){
                    count = count+1;
                }
            }
            if(count==1){
                return digit;
            }
        }
        return -1;
    }
}