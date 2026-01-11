/* 1047. Remove All Adjacent Duplicates In String

You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.

We repeatedly make duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.*/

class Solution {
    public String removeDuplicates(String s) {
        Stack <Character> stack = new Stack<>();
      
        for(char ch : s.toCharArray()){
            if(stack.isEmpty() != true && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        String result = "";
        while(stack.isEmpty() != true){
            result = stack.pop() + result;
        } 
        return result;
       
    }
}
