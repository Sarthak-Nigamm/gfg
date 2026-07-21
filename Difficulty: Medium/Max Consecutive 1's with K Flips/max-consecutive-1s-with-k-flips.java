class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        int left = 0;
        int max_len = 0;
        int zero_count = 0;

        for (int right = 0; right < arr.length; right++) {
            // Agar current element 0 hai, toh count badha do
            if (arr[right] == 0) {
                zero_count++;
            }

            // Agar zeros allowed k se zyada ho gaye, toh window ko left se shrink karo
            while (zero_count > k) {
                if (arr[left] == 0) {
                    zero_count--;
                }
                left++;
            }

            // Current valid window ka max size update karo
            max_len = Math.max(max_len, right - left + 1);
        }

        return max_len;
    }
}
