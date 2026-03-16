/*448. Find All Numbers Disappeared in an Array

Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

*/

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        int n = nums.length;
        ArrayList <Integer> arrayList = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        for(int i = 1; i <= n; i++){
            if(!set.contains(i)){
                arrayList.add(i);
            }
        }
        return arrayList;
    }
}
