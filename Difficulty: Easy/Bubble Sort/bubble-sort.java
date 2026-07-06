class Solution {
    public void bubbleSort(int[] arr) {
        // Hum helper function ko call karenge jisme 'n' pass kar sakein
        bubbleSortRecursive(arr, arr.length);
    }

    private void bubbleSortRecursive(int[] arr, int n) {
        // Base case: agar array size 1 hai, toh return karo
        if (n <= 1) {
            return;
        }

        // Ek pass: is pass mein hum array ke (n-1) index tak check karenge
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // Swapping logic
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // Recursive call: agle pass ke liye size ko n-1 kar do
        bubbleSortRecursive(arr, n - 1);
    }
}