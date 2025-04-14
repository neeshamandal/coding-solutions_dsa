class Solution {
    public String reverseWords(String s) {
        String temp = "";
        String ans = "";
        int left = 0;
        int right = s.length()-1;

        while(left<=right){
            if(s.charAt(left)!=' '){
                if(temp != " ")
                    temp+= s.charAt(left);       
            }else{
                if(!temp.isEmpty()){
                    if(!ans.isEmpty()){
                    ans = temp + " "  + ans;
                }else{
                    ans = temp;
                }
                }
                
                temp = "";
            }
            left++;
        }

        if(!temp.isEmpty()){
            if(!ans.isEmpty()){
                 ans = temp + " " + ans;
            }else{
                ans = temp;
            }
           
        }

        return ans;
    }
}