//https://leetcode.com/problems/unique-binary-search-trees/
//G(n) = G(0) * G(n-1) + G(1) * G(n-2) + … + G(n-1) * G(0) 
class Solution {
    public int numTrees(int n) {
        int[]numbers=new int[n+1];
        numbers[0]=1;
        numbers[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++){
                numbers[i]+=numbers[j-1]*numbers[i-j];
            }
        }
        return numbers[n];
    }
}