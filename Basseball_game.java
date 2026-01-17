/*682. Baseball Game

You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.

You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:

An integer x.
Record a new score of x.
'+'.
Record a new score that is the sum of the previous two scores.
'D'.
Record a new score that is the double of the previous score.
'C'.
Invalidate the previous score, removing it from the record.
Return the sum of all the scores on the record after applying all the operations.

The test cases are generated such that the answer and all intermediate calculations fit in a 32-bit integer and that all operations are valid.

 */

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum1 = 0;
        for (String ch : operations) {
            if (stack.isEmpty() != true) {
                if (ch.equals("C")) {
                    stack.pop();
                } else if (ch.equals("D")) {
                    int x = stack.peek();
                    stack.push(x * 2);
                } else if (ch.equals("+")) {
                    int b = stack.pop();
                    int a = stack.pop();

                    stack.push(a);
                    stack.push(b);
                    stack.push(a + b);
                } else {
                    stack.push(Integer.parseInt(ch));
                }
            } else {
                stack.push(Integer.parseInt(ch));
            }
        }
        int sum2 = 0;
        while (stack.isEmpty() != true) {
            sum2 = sum2 + stack.pop();
        }
        return sum2;
    }
}
