 /*171. Excel Sheet Column Number

Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
*/

class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for(int i = 0; i < columnTitle.length(); i++){
            int value = columnTitle.charAt(i) - 'A' + 1;
            result = result * 26 + value;
        }
        return result;
    }
}
