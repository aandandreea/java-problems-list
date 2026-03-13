/*217. Contains Duplicate

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            int current = map.getOrDefault(nums[i],0);
            if(current != 0){
                return true;
            }
            map.put(nums[i], 1);
        }
        return false;
    }
}
