/*53. Maximum Subarray

Given an integer array nums, find the subarray with the largest sum, and return its sum.*/

class Solution {
    public int maxSubArray(int[] nums) {
        //Algoritmul lui Kadane

        int current = nums[0];
        int maxSum = nums[0];
        for(int i = 1 ; i < nums.length; i++){
            current = Math.max(nums[i], current + nums[i]);
            maxSum = Math.max(maxSum, current);
        }
        return maxSum;
    }
}
