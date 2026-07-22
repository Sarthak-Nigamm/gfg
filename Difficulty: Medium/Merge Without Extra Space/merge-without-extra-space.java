import java.util.*;
class Solution {
    public void mergeArrays(int a[], int b[]) {
        // code here
        int i =a.length-1;
        int j = 0;
        while(j<b.length && i>-1){
            if(a[i]>b[j]){
                int temp = a[i];
                a[i] = b[j];
                b[j] = temp;
               i--;
               j++;
            }else if(a[i]<=b[j]){
                break;
            }
            
        }
        Arrays.sort(a);
        Arrays.sort(b);

    }
}
