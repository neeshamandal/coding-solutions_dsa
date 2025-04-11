class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int balance = 0;
        int start = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                balance++;
            } else {
                balance--;
            }
            
            if (balance == 0) {
                // Add the substring excluding the first and last characters
                result.append(s.substring(start + 1, i));
                start = i + 1;
            }
        }
        
        return result.toString();
    }
}