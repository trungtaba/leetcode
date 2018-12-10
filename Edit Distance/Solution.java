//https://leetcode.com/problems/edit-distance/
/*
Input: word1 = "horse", word2 = "ros"
Output: 3
Explanation: 
horse -> rorse (replace 'h' with 'r')
rorse -> rose (remove 'r')
rose -> ros (remove 'e')
*/

class Solution {
    public int minDistance(String word1, String word2) {
        
        int m = word1.length();

        int n =word2.length();
        


        int distance[][]=new int[m+1][n+1];

        //base case
        for(int i=0;i<=m;i++){
            distance[i][0]=i;
        }

        for(int i=0;i<=n;i++){
            distance[0][i]=i;
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(word1.charAt(i)==word2.charAt(j)){
                    distance[i+1][j+1]=distance[i][j];
                }else{
                    int a= distance[i][j];
                    int b=distance[i][j+1];
                    int c=distance[i+1][j];
                    distance[i+1][j+1]=1+ Math.min(Math.min(a, b), c);
                }

            }
        }

        return distance[m][n];
    }
}