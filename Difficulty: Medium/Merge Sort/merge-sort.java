class Solution {
    public void merge(int arr[], int si, int ei,int mid) {
      int temp[] = new int[ei-si+1];
      int i =si,j=mid+1,k=0;
      while(i<=mid && j<=ei){
          if(arr[i]<=arr[j]){
              temp[k] = arr[i];
              i++;
          }else{
              temp[k] = arr[j];
              j++;
          }
          k++;
      }
      while(i<=mid){
          temp[k++] = arr[i++];
      }
       while(j<=ei){
          temp[k++] = arr[j++];
      }
      //copy
      for(int c = si; c<=ei;c++){
          arr[c] = temp[c-si];
      }
    }
    public void mergeSort(int arr[], int si, int ei) {
       if(si>=ei){
           return;
       }
        int mid = si+(ei-si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,ei,mid);
    }
}