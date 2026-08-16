class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int maxsum = 0;
        int curr = 0;
        for(int i =0; i<arr.length; i++){
            curr += arr[i];
            if(curr<0){
                curr=0;
            }
            maxsum = Math.max(curr,maxsum);
        }
        if(maxsum == 0){
            maxsum= Integer.MIN_VALUE;
            for(int i =0; i<arr.length; i++){
             maxsum = Math.max(arr[i],maxsum);
            }
        }
  return maxsum;  }
}
