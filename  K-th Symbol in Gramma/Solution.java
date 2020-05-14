/*https://leetcode.com/problems/k-th-symbol-in-grammar/
Examples:
Input: N = 1, K = 1
Output: 0

Input: N = 2, K = 1
Output: 0

Input: N = 2, K = 2
Output: 1

Input: N = 4, K = 5
Output: 1

Explanation:
row 1: 0
row 2: 01
row 3: 0110
row 4: 01101001
*/

class Solution {
    public int kthGrammar(int N, int K) {
        if(N==1) return 0;
        if(K%2==0)return kthGrammar(N-1,K/2)==0?1:0;
        else return kthGrammar(N-1,K/2+1)==0?0:1;
    }
}