/*709. To Lower Case

Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

*/

class Solution {
    public String toLowerCase(String s) {
       StringBuilder sb = new StringBuilder();
       
       for(int i = 0; i < s.length(); i++){
        char ch = s.charAt(i);
        if(ch <= 90 && ch >=65){
            ch =(char)(ch + 32);
        }
        sb.append(ch);
       }
       return sb.toString();
}
}
