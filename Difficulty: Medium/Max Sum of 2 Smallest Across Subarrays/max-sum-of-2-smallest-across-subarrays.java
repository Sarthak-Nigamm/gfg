class Solution {
    public int maxSum(int arr[]) {
        // code here
        int n = arr.length;

        // Agar array me 2 se kam elements hain (waise constraints >=2 hai)
        if (n < 2) return -1; 

        int max = Integer.MIN_VALUE;

        // Sirf adjacent elements ka sum nikalna hai
        for (int i = 0; i < n - 1; i++) {
            int currentSum = arr[i] + arr[i + 1];
            max = Math.max(max, currentSum);
        }

        return max; 
    }
}