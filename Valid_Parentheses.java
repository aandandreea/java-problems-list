/* 20. Valid Parentheses

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
*/

class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0){
            return false;
        }
        Stack <Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '('){
                stack.push(')');
            } else if(ch == '{'){
                stack.push('}');
            } else if(ch == '['){
                stack.push(']');
            } else 
            if(ch == ')' || ch == ']' || ch == '}'){
                if(stack.isEmpty()){
                    return false;
                } else if(ch == stack.peek()){
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if(stack.isEmpty() == true){
            return true;
        } else {
            return false;
        }
    }
}
