class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int windowStart = 0;
        int maxCount = 0;
        for(int windowEnd=0;windowEnd<nums.length;windowEnd++){
            if(nums[windowEnd]==0){
                windowStart = windowEnd+1;
            }
            maxCount = Math.max(maxCount,windowEnd-windowStart+1);

        }
        return maxCount;
        
    }
}