/*459. Repeated Substring Pattern

Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.

*/

class Solution {
    public boolean repeatedSubstringPattern(String s) {
       String doubleString = s + s;
       String trimmed = doubleString.substring(1,doubleString.length() - 1);
       return trimmed.contains(s);
    }
}
