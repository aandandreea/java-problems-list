/*434. Number of Segments in a String

Given a string s, return the number of segments in the string.

A segment is defined to be a contiguous sequence of non-space characters.*/

class Solution {
    public int countSegments(String s) {
        String[] words = s.split(" ");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals("")) {
                count++;
            }
        }
        return count;
    }
}
