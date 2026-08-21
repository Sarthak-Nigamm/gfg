class Solution {
    public void rotateMatrix(int[][] mat) {
        // code here
         int n = mat.length;
           for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                // Secondary diagonal reflection mapping
                int temp = mat[i][j];
                mat[i][j] = mat[n - 1 - j][n - 1 - i];
                mat[n - 1 - j][n - 1 - i] = temp;
            }
        }    
        for(int i =0; i<n; i++){
                int cs =0;
                int ce = n-1;
                while(cs<=ce){
                    int temp = mat[i][cs];
                    mat[i][cs] = mat[i][ce];
                    mat[i][ce] = temp;
                    cs++;
                    ce--;
                }
            }
    }
}