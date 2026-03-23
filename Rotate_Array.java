/*189. Rotate Array

Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

*/

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % nums.length;

        int[] arr = new int[nums.length];

        for (int i = 0; i < n; i++) {
            int index = (i + k) % n;
            arr[index] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = arr[i];
        }
    }
}
