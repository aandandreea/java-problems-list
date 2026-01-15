/* 844. Backspace String Compare
Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

*/

class Solution {
    public boolean backspaceCompare(String s, String t) {
       Stack <Character> stack1 = new Stack<>();
        Stack <Character> stack2 = new Stack<>();
        for(char ch1 : s.toCharArray()){
            if(stack1.isEmpty() != true){
                if(ch1 != '#'){
                    stack1.push(ch1);
                } else {
                    stack1.pop();
                }
            } else {
                if(ch1 != '#')
                stack1.push(ch1);
            }
        }
        for(char ch2 : t.toCharArray()){
            if(stack2.isEmpty() != true){
                if(ch2 != '#'){
                    stack2.push(ch2);
                } else {
                    stack2.pop();
                }
            } else {
                if(ch2 != '#')
                stack2.push(ch2);
            }
        }
        if(stack1.equals(stack2)){
            return true;
        } else {
            return false;
        }
     
    }
}
