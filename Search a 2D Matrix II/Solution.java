//https://leetcode.com/problems/search-a-2d-matrix-ii/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0)
            return false;
        return searchMatrix(matrix, target, 0, matrix.length - 1, 0, matrix[0].length - 1);
    }

    public boolean searchMatrix(int[][] matrix, int target, int leftCol, int rightCol, int leftRow, int rightRow) {
        if (leftCol > rightCol || leftRow > rightRow)
            return false;
        if (leftCol == rightCol && leftRow == rightRow) {
            if (matrix[leftCol][leftRow] == target)
                return true;
            else
                return false;
        }
        int midCol = (leftCol + rightCol) / 2;
        int midRow = (leftRow + rightRow) / 2;
        if (matrix[midCol][midRow] == target)
            return true;
        if (matrix[midCol][midRow] > target)
            return searchMatrix(matrix, target, leftCol, midCol, leftRow, midRow)
                    || searchMatrix(matrix, target, leftCol, midCol, midRow + 1, rightRow)
                    || searchMatrix(matrix, target, midCol + 1, rightCol, leftRow, midRow);
        else
            return searchMatrix(matrix, target, leftCol, midCol, midRow + 1, rightRow)
                    || searchMatrix(matrix, target, midCol + 1, rightCol, leftRow, midRow)
                    || searchMatrix(matrix, target, midCol + 1, rightCol, midRow + 1, rightRow);
    }
}