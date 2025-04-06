class Solution {
    public void nextPermutation(int[] nums) {
        int minIdx = -1;
        for(int i = nums.length-1; i>0;i--){
            if(nums[i]>nums[i-1]){
                minIdx = i-1;
                break;
            }
        }

        if(minIdx<0){
            int x = 0;
            int y = nums.length-1;
            reverse(nums,x,y);
            return;   
        }

        for(int i = nums.length-1; i>minIdx;i--){
            if(nums[i]>nums[minIdx]){
                swap(nums,i,minIdx);
                break;
            }

        }
            int x = minIdx+1;
            int y = nums.length-1;
            reverse(nums,x,y);


        
    }

    public void reverse(int[] nums, int x , int y){
        while(x<y){
               swap(nums,x,y);
                x++;
                y--;
            }
    }

    public void swap(int[] nums, int x , int y){
        int temp = nums[x];
         nums[x] = nums[y];
        nums[y] = temp;
    }
}