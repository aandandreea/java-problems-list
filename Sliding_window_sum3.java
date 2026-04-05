/*Find the maximum sum of subarray of target length.*/

class Solution {
    public int maxSubArraySum(int target, int[] nums) {
        int sum = 0;

        for(int i = 0; i < target; i++){
            sum += nums[i];
        }
            int max = sum;
        for(int i = target; i < nums.length; i++){
            sum += nums[i];
            sum -= nums[i - target];

            max = Math.max(sum,max);
        }
        return max;
    }
}
