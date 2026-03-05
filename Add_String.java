/*415. Add Strings

Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.

*/

class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0){
            int a1 = (i >= 0)? num1.charAt(i) - '0' : 0;
            int a2 = (j >= 0)? num2.charAt(j) - '0' : 0;
            
            int sum = a1 + a2 + carry;
            sb.append(sum % 10);
            carry = sum / 10;

            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}
