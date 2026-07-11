class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int floor = -1;
        int ceil = -1;
        int count = 0;
        int nums[] = new int[2];
        for(int i =0; i<arr.length; i++){
            if(arr[i]<x || arr[i] ==x){
                floor = Math.max(floor,arr[i]);
            }
            if(arr[i]>x || arr[i]== x){
                if(count == 0){
                    ceil = arr[i];
                    count++;
                }
                ceil = Math.min(ceil,arr[i]);
                
            }
            
        }
        nums[0] =floor;
        nums[1] =ceil;
   return nums; }
}
