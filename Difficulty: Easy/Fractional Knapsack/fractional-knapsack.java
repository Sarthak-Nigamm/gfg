class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int W) {
        // code here
        int n = wt.length;
        double r[][] = new double[n][2];
        for(int i =0; i<n; i++){
            r[i][0] = i;
            r[i][1] = val[i]/(double)wt[i];
        }
        Arrays.sort(r,Comparator.comparingDouble(o->o[1]));
        
        double fv = 0;
        for(int i =n-1; i>=0; i--){
            int idx = (int)r[i][0];
            if(W>=wt[idx]){
                fv+=val[idx];
                W-=wt[idx];
            }else{
                fv+=(r[i][1]*W);
                break;
            }
        }
    return fv;}
}