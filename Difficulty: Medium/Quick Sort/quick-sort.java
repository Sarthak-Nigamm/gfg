class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low<high){
        int pidx  = partition(arr,low,high);
        quickSort(arr,low,pidx-1);
        quickSort(arr,pidx+1, high);
      }}

    private int partition(int[] arr, int low, int high) {
        
        // code here
        int pivot = arr[high];
          int pos = low-1;
        for(int i =low; i<high; i++){
            if(arr[i]<pivot){
                pos++;
                //swap
                int temp = arr[pos];
                arr[pos] = arr[i];
                arr[i] = temp;
            }
            
        }
        pos++;
        int temp = arr[pos];
        arr[pos] = pivot;
        arr[high] = temp;
        
   return pos; }
}