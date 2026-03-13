/*202. Happy Number

Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

*/

class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = next(n);
        while(fast != 1 && slow != fast){
            slow = next(slow);
            fast = next(next(fast));
        }
        return fast == 1;
    }
    public int next(int n){
        int sum = 0;
        while(n > 0){
            int cifra = n % 10;
            sum = sum + cifra * cifra;
            n = n / 10;
        }
        return sum;

}
}
