/*238. Product of Array Except Self

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        int left = 1;
        int right = 1;
        int i = 0;

        while(i < nums.length){
            answer[i] = left;
            left = left * nums[i];
            i++;
        }
        int j = nums.length - 1;

        while(j >= 0){
            answer[j] = answer[j] * right;
            right = right * nums[j];
            j--;
        }
        return answer;
    }
}
