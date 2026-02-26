/*242. Valid Anagram

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

*/

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freqs = new int[26];
        int[] freqt = new int[26];
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            freqs[ch - 'a']++;
        }
        for(int j = 0; j < t.length(); j++){
            char c = t.charAt(j);
            freqt[c - 'a']++;
        }
        if(Arrays.equals(freqs,freqt)){
            return true;
        } else return false;

    }
}
