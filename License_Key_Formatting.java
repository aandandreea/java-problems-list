/*482. License Key Formatting

You are given a license key represented as a string s that consists of only alphanumeric characters and dashes. The string is separated into n + 1 groups by n dashes. You are also given an integer k.

We want to reformat the string s such that each group contains exactly k characters, except for the first group, which could be shorter than k but still must contain at least one character. Furthermore, there must be a dash inserted between two groups, and you should convert all lowercase letters to uppercase.

Return the reformatted license key.*/

class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String upper = s.toUpperCase();
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for(int i = upper.length() - 1; i >= 0; i--){
            char ch = upper.charAt(i);
            if(ch == '-'){
                continue;
            } 
            if(count == k){
                sb.append("-");
                count = 0;
            } 
                sb.append(ch);
                count++;
        }
        return sb.reverse().toString();
    }
}
