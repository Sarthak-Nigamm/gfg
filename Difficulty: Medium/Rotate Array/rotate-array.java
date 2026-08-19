class Solution {
    public void rotateArr(int nums[], int k) {
        // code here
        int n = nums.length;
        int arr[] = new int[n];
        k = k%n;
        if(k==0) return;
        int j =0;
        for(int i =k; i<n; i++){
            arr[j] = nums[i];
            j++;
        }
        int i =0;
        while(i<k){
            arr[j] = nums[i];
            j++;
            i++;
        }
        //copy
        for (int c =0; c<n; c++){
            nums[c] = arr[c];
        }

}}