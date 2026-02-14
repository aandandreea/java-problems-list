/*14. Longest Common Prefix
Solved
Easy

Topics
premium lock icon
Companies
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".*/

class Solution {
    public String longestCommonPrefix(String[] strs) {
      
        for(int i = 0; i < strs[0].length(); i++){
            char curr = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++){
                if(i >= strs[j].length() || strs[j].charAt(i) != curr){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}
