class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int i =0, j = arr.length-1;
        while(i<j){
            int mid = i+(j-i)/2;
            if(arr[mid]>arr[j]){
                i = mid+1;
            }else{
                j = mid;
            }
        }
   return i; }
}