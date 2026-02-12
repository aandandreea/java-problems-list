/* 394. Decode String

Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].

The test cases are generated so that the length of the output will never exceed 105.

*/

class Solution {
    public String decodeString(String s) {
        Stack <StringBuilder> stringStack = new Stack<>();
        Stack <Integer> countStack = new Stack<>();

        StringBuilder curr = new StringBuilder();
        int n = 0;
        for(int i = 0;i < s.length(); i ++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                n = n * 10 + (ch - '0');
            } else if(ch == '['){
                stringStack.push(curr);
                countStack.push(n);

                curr = new StringBuilder();
                n = 0;
            } else if(ch == ']'){
                int k = countStack.pop();
                StringBuilder prev = stringStack.pop();

                for(int a = 0; a < k ; a++){
                    prev.append(curr);
                }
                curr = prev;
            } else {
                curr.append(ch);
            }
        }
        return curr.toString();
    }
}
