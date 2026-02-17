/*58. Length of Last Word

Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

*/

class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1,length = 0;
        while(i >= 0 && s.charAt(i) == ' '){
            i--;
        }
        while(i >= 0 && s.charAt(i) != ' '){
            length++;
            i--;
        }
        return length;

    }
}
