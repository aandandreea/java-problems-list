/*7. Reverse Integer
S
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.*/

class Solution {
    public int reverse(int x) {
        int result = 0;
        while(x != 0){
            int c = x % 10;
            x = x/10;
            if(result < Integer.MIN_VALUE / 10 || result > Integer.MAX_VALUE / 10){
                return 0;
            }
            result = result * 10 + c;
        }
        return result;
    }
}
