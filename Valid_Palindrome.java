/*125. Valid Palindrome

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 */

class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if((ch >= 'a' && ch <= 'z' ) || (ch >= '0' && ch <= '9')){
                sb.append(ch);
            }
        }
        int right = sb.length() - 1;
        int left = 0;
        while(left < right){
            if(sb.charAt(left) != sb.charAt(right)){
                return false;
        }
        left++;
        right--;
        }
    return true;
    }
}
