/*56. Merge Intervals

Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.*/

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();

        for(int[] current : intervals){
            if(result.isEmpty() || current[0] > result.get(result.size() - 1)[1]){
                result.add(current);
            } else {
                int[] latest = result.get(result.size() - 1);
                latest[1] = Math.max(latest[1], current[1]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
