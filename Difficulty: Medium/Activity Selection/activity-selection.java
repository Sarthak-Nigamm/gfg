class Solution {
    public int activitySelection(int[] start, int[] finish) {
        // code here
        int a[][] = new int[start.length][3];
        for(int i =0; i<start.length; i++){
            a[i][0] = i;
            a[i][1] = start[i];
            a[i][2] = finish[i];
        }
        Arrays.sort(a,Comparator.comparingDouble(o->o[2]));
        int max = 1;
        int lastend = a[0][2];
        for(int i = 1; i<start.length; i++){
            if(a[i][1]>lastend){
                max++;
                lastend = a[i][2];
            }
        }
   return max; }
}
