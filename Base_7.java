/*504. Base 7

Given an integer num, return a string of its base 7 representation.

*/

class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        int rest = 0;
        boolean negative = num < 0;
        num = Math.abs(num);
        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            sb.append(num % 7);
            num = num / 7;
        }
        if (negative) {
            sb.append("-");
        }
        return sb.reverse().toString();
    }
}
