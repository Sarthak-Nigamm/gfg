class Solution {
    public void insertionSort(int[] arr) {
    for(int i =0; i<arr.length; i++ ){
        int prev = i-1;
     int curr = arr[i];
     while(prev>-1 && arr[prev]>curr){
         arr[prev+1] = arr[prev];
         prev--;
     }
     arr[prev+1] = curr;
   }
    }
}

