/* 168. Excel Sheet Column Title
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.*/

class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        
        while(columnNumber > 0){
            columnNumber--;
            int r = columnNumber % 26;
            sb.append((char)('A' + r));
            columnNumber = columnNumber / 26;
        }
        return sb.reverse().toString();
    }
}
