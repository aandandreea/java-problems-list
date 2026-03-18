/*350. Intersection of Two Arrays II

Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

*/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        ArrayList <Integer> array = new ArrayList<>();

        for(int n : nums1){
            map.put(n,map.getOrDefault(n,0) + 1);
        }
        for(int n : nums2){
            if(map.containsKey(n) && map.get(n) > 0 ){
                array.add(n);
                map.put(n,map.get(n) - 1);
            }
        }
        int[] result = new int[array.size()];
        for(int i = 0; i < array.size(); i++){
            result[i] = array.get(i);
        }
        return result;
}
}
