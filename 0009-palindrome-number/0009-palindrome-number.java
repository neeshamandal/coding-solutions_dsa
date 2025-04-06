class Solution {
    public boolean isPalindrome(int x) {
        if(x <0){
            return false;
        }
        int originalNum = x;
        int reverseNum = 0;
        while(x>0){
            int digit = x%10;
            reverseNum = (reverseNum*10)+digit;
            x/= 10;

        }
        if(originalNum == reverseNum){
            return true;
        }else{
           return false;
        }
        
    }
}