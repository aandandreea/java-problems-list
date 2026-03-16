/*645. Set Mismatch

You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

*/

class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int duplicate = -1;
        int missing = -1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){
                duplicate = nums[i];
            } else if(nums[i] > nums[i - 1] + 1){
                missing = nums[i - 1] + 1;
            }
        }

        if (nums[0] != 1) {
            missing = 1;
        } else if (nums[nums.length - 1] != nums.length) {
            missing = nums.length;
        }


     return new int[]{duplicate, missing};
    }
}
