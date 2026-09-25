class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length, n = mat[0].length;

        int row = 0, col = 0;
        int direction = 1;

        int[] res = new int[m * n];

        for(int i = 0; i < m * n; i++) {
            res[i] = mat[row][col];

            if(direction == 1) {
                if(col == n - 1) {
                    row++;
                    direction = -1;
                } else if(row == 0) {
                    col++;
                    direction = -1;
                } else {
                    row--;
                    col++;
                }
            } else {
                if(row == m - 1) {
                    col++;
                    direction = 1;
                } else if(col == 0) {
                    row++;
                    direction = 1;
                } else {
                    row++;
                    col--;
                }
            }
        }
        return res;
    }
}