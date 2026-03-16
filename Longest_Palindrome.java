/*409. Longest Palindrome

Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome.

*/

class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int count = 0;
        boolean mid = false;

        for (int freq : map.values()) {
            if (freq % 2 == 0) {
                count += freq;
            } else {
                count += freq - 1;
                mid = true;
            }
        }
        if (mid == true) {
            count += 1;
        }
        return count;
    }
}
