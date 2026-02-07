/* 316. Remove Duplicate Letters
Hint
Given a string s, remove duplicate letters so that every letter appears once and only once. You must make sure your result is the smallest in lexicographical order among all possible results.

*/

class Solution {
    public String removeDuplicateLetters(String s) {
     int[] v = new int[26];
     for(char ch : s.toCharArray()){
        v[ch - 'a']++;
     }
     
     StringBuilder sb = new StringBuilder();
     for(int i = 0 ; i< v.length; i++){
        if(v[i] > 0){
            sb.append((char)(i + 'a'));
        }
     }
    return sb.toString();

    }
}
