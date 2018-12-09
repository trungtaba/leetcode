//https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/559/
class Solution {
    public static final int[] plusOne(int[] digits) {
        int carry = 1;
        int[] result = new int[digits.length];
        for (int i = digits.length - 1; i >= 0; i--) {
            int val = digits[i] + carry;
            result[i] = val % 10;
            carry = val / 10;
        }
        if (carry == 1) {
            result = new int[digits.length + 1];
            result[0] = 1;
        }
        return result;
    }
}