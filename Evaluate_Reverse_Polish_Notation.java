/* 150. Evaluate Reverse Polish Notation

You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.

Evaluate the expression. Return an integer that represents the value of the expression.

Note that:

The valid operators are '+', '-', '*', and '/'.
Each operand may be an integer or another expression.
The division between two integers always truncates toward zero.
There will not be any division by zero.
The input represents a valid arithmetic expression in a reverse polish notation.
The answer and all the intermediate calculations can be represented in a 32-bit integer.*/

class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> stack = new Stack<>();
        for(String ch : tokens){
            if(ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                if(ch.equals("+")){
                    stack.push(a+b);
                } else if(ch.equals("-")){
                    stack.push(a-b);
                } else if(ch.equals("*")){
                    stack.push(a*b);
                } else {
                    stack.push(a/b);
                }
            } else stack.push(Integer.parseInt(ch));
        }
        return stack.pop();
    }
}
