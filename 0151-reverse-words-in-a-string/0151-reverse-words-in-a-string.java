class Solution {
    public String reverseWords(String s) {
        String ans = "";
        String str = "";
        Stack<String> stack = new Stack();

        for(int i = 0; i<s.length();i++){
            if(s.charAt(i)==' '){
                if(!str.isEmpty()){
                    stack.push(str);
                str = "";
                }
                
            }else{
                    str+= s.charAt(i);
            }
        }
        if(!str.isEmpty()){
            stack.push(str);
        }

        while(stack.size()!=1){
            ans+= stack.peek() + " ";
            stack.pop();
        }
        ans+= stack.peek();

        return ans;
    }
}