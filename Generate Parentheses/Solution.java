//https://leetcode.com/problems/generate-parentheses/
class Solution {
    List<String> result;

    public List<String> generateParenthesis(int n) {
        result = new LinkedList<String>();
        backtrack("", n, n);
        return result;
    }

    // private void backtrack(String c, int i, int j) {
    // if (i > j)
    // return;

    // if (i == 0 && j == 0) {
    // result.add(c);
    // return;
    // }

    // if (i > 0) {
    // backtrack( c+"(", i - 1, j);
    // }

    // if (j > 0) {
    // backtrack( c+")", i, j - 1);
    // }
    // }

    private void backtrack(String c, int i, int j) {
        if (i > j)
            return;
        // System.out.println(i+" "+j);
        if (i == 0 && j == 0) {
            result.add(c.toString());
            return;
        }
        if (i == j) {
            backtrack(c+"(", i - 1, j);
        } else if (i == 0) {
            backtrack(c+")", i, j - 1);
        } else {
            backtrack(c+"(", i - 1, j);
            backtrack(c+")", i, j - 1);
        }
    }
}