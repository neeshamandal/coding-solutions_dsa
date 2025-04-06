class Solution {
    public int reverse(int x) {
        int reverseDigit = 0;
        int prevNumber = 0;
        boolean isNegative = x<0;
        if(isNegative){
            x=x*-1;
        }
        while(x>0){
            int digit = x%10;
            reverseDigit = (reverseDigit*10)+digit;
            if((reverseDigit-digit)/10 !=prevNumber){
                return 0;
            }
            prevNumber = reverseDigit;
            x/=10;
        }
        if(isNegative){
           reverseDigit = reverseDigit*-1;
        }
        return reverseDigit;
    }
}