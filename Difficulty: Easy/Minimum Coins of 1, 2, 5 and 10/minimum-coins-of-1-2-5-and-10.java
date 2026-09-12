class Solution {
    public int findMin(int n) {
        // code here
        int count = 0;
        int arr[] ={10,5,2,1};
        for(int i =0; i<4; i++){
            if(n>=arr[i]){
                while(n>=arr[i]){
                    n-=arr[i];
                    count++;
                }
            }
        }
   return count; }
}
