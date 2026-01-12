/* 3174. Clear Digits

You are given a string s.

Your task is to remove all digits by doing this operation repeatedly:

Delete the first digit and the closest non-digit character to its left.
Return the resulting string after removing all digits.

Note that the operation cannot be performed on a digit that does not have any non-digit character to its left.

*/

class Solution {
    public String clearDigits(String s) {
        Stack <Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
                if(Character.isDigit(ch)){
                if(stack.isEmpty() != true)
                stack.pop();
            } else {
                stack.push(ch);
            }
            }
             StringBuilder result = new StringBuilder();
            for(char c : stack){
                result.append(c);
            }
            return result.toString();

        
    }
}
