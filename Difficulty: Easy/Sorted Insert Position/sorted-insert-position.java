class Solution {
    public int searchInsertK(int arr[], int target) {
        // code here
                int si = 0;
                int ei = arr.length - 1;

                while (si <= ei) {
                    int mid = si + (ei - si) / 2;

                    if (arr[mid] == target) {
                        return mid; // Target mil gaya
                    }
                    if (arr[mid] > target) {
                        ei = mid - 1; // Left search area
                    } else {
                        si = mid + 1; // Right search area
                    }
                }

                return si; // Correct insert index jab target array me nahi ho
            }
        }