class Solution {
    public void makeZeros(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        // Step 1: Copy create karo taaki original values safe rahein
        int[][] temp = new int[n][m];
        for (int i = 0; i < n; i++) {
            temp[i] = matrix[i].clone();
        }

        // Step 2: Iterate karo aur logic apply karo
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (temp[i][j] == 0) {
                    int sum = 0;
                    
                    // Sum calculate karo temp matrix se
                    if (i - 1 >= 0) sum += temp[i - 1][j];
                    if (i + 1 < n)  sum += temp[i + 1][j];
                    if (j - 1 >= 0) sum += temp[i][j - 1];
                    if (j + 1 < m)  sum += temp[i][j + 1];
                    
                    // Original matrix update karo
                    matrix[i][j] = sum;
                    
                    // Adjacent ko 0 set karo
                    if (i - 1 >= 0) matrix[i - 1][j] = 0;
                    if (i + 1 < n)  matrix[i + 1][j] = 0;
                    if (j - 1 >= 0) matrix[i][j - 1] = 0;
                    if (j + 1 < m)  matrix[i][j + 1] = 0;
                }
            }
        }
    }
}