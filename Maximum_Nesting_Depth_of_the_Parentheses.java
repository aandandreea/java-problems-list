/* 1614. Maximum Nesting Depth of the Parentheses

Given a valid parentheses string s, return the nesting depth of s. The nesting depth is the maximum number of nested parentheses.

*/

class Solution {
    public int maxDepth(String s) {
        int curr = 0;
        int max = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                curr++;
                max = Math.max(curr,max);
            } else if(ch == ')'){
                curr--;
            }
        }
        return max;
    }
}
