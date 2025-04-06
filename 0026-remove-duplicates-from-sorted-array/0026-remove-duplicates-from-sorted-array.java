class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        int right = 0;
        int count = 1;

        while(left<nums.length && right<nums.length){
            if(nums[left]!=nums[right]){
                left = left+1;
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                count = count+1;

            }
            right++;
        }
        return count;
    }
}