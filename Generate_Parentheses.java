/*22. Generate Parentheses

Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
*/

class Solution {
    private int n;
    List<String> result = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        this.n = n;
        backtracking("", 0, 0);
        return result;
    }

    public void backtracking(String current, int open, int close){
        if(current.length() == n * 2){
            result.add(current);
            return;
        }
        if(open < n){
            backtracking(current + "(",open + 1, close);
        }
        if(close < open){
            backtracking(current + ")", open, close + 1);
        }
    }
}
