/*16. 3Sum Closest

You are given an integer array nums of length n and an integer target.

Find three integers at distinct indices in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.

*/

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];

        for(int i = 0; i < nums.length - 2; i++){
            int left = i + 1, right = nums.length - 1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if(Math.abs(target - sum) < Math.abs(target - closest)){
                    closest = sum;
                } else
                if(sum < target){
                    left++;
                } else
                if(sum > target){
                    right--;
                } else return sum;
            }
        }
        return closest;

    }
}
