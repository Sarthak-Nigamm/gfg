class Solution {
    public int firstSearch(int[] nums, int target) {
        int si = 0;
        int ei = nums.length - 1;
        int firstOccurrence = -1; // Default to -1 if target is not found
        
        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            
            if (nums[mid] == target) {
                firstOccurrence = mid; // Record the potential answer
                ei = mid - 1;          // Keep searching the left half for an earlier match
            } 
            else if (nums[mid] > target) {
                ei = mid - 1;
            } 
            else {
                si = mid + 1;
            }
        }
        
        return firstOccurrence;
    }
}