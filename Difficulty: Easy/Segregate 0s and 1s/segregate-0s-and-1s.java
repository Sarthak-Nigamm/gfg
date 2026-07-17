class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int i =0;
        int j = 0;
        while(i<arr.length && j<arr.length){
            if(arr[j]==0){
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
            j++;
        }
    }
}
