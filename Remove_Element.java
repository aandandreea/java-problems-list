/*27. Remove Element

Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.*/

class Solution {
    public int removeElement(int[] nums, int val) {
        int a = 0;
        int b = nums.length - 1;
        while(a <= b){
            if(nums[a] == val){
                int temp = nums[b];
                nums[b] = nums[a];
                nums[a] = temp;
                b--;
            } else a++;
        }
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                 k++;
            } 
        }
        return k;
    }
}
