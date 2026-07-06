class Solution {
    public void insertionSort(int[] arr) {
        // Helper function ko call karo, n = array ka length
        insertionSortRecursive(arr, arr.length);
    }

    private void insertionSortRecursive(int[] arr, int n) {
        // Base case: agar array size 1 hai, toh sorted hai
        if (n <= 1) {
            return;
        }

        // 1. Pehle n-1 elements ko sort karo (Recursion)
        insertionSortRecursive(arr, n - 1);

        // 2. Ab 'last' element ko sorted part mein insert karo
        int last = arr[n - 1];
        int j = n - 2;

        // Shift elements jo 'last' se bade hain
        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = last;
    }
}