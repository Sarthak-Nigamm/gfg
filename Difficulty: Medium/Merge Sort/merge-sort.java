class Solution {
    public static void merge(int arr[], int l, int mid, int r){
        int temp[] = new int[r - l + 1];
        int i =l;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=r ){
            if(arr[i]>arr[j]){
                temp[k] = arr[j];
                k++;
                j++;
            }else if(arr[i]<=arr[j]){
                temp[k] = arr[i];
                k++;
                i++;
            }
            
        }
        //left remaining 
        while(i<=mid){
            temp[k] = arr[i];
            k++;
            i++;
        }
        //right remaining
        while(j<=r){
            temp[k] = arr[j];
            k++;
            j++;
        }
        
        //copy to original
        for(int c =0; c<k; c++){
            arr[c+l]  = temp[c];
        }
    }
    public void mergeSort(int arr[], int l, int r) {
        if(l<r){
            int mid = l-((l-r)/2);
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
}
