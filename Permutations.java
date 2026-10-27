/*46. Permutations

Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.*/

class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        backtrack(nums, new ArrayList<>(), new boolean[nums.length]);
        return result;
    }
    public void backtrack(int[] nums, List<Integer> current, boolean[] used){
        if(current.size() == nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int k = 0; k < nums.length; k++){
            if(used[k]){
                continue;
            }
            current.add(nums[k]);
            used[k] = true;

            backtrack(nums, current, used);

            current.remove(current.size() - 1);
            used[k] = false;
        }
    }
}
