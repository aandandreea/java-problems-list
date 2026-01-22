/* 2000. Reverse Prefix of Word

Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.

For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
Return the resulting string.*/

class Solution {
    public String reversePrefix(String word, char ch) {
        Stack <Character> stack = new Stack<>();
        int i = 0;
        while(i < word.length()){
            char c = word.charAt(i);
            stack.push(c);
            if(c == ch){
                break;
            }
            i++;
        }
        if(i == word.length()){
            return word;
        }

        StringBuilder sb = new StringBuilder();
        while(stack.isEmpty() != true){
            sb.append(stack.pop());
        }
        sb.append(word.substring(i+1));
        return sb.toString();
    }
}
