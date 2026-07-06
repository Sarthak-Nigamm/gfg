import java.util.*;

class Solution {
    public int longestConsecutive(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        
        Arrays.sort(arr);
        
        int longest = 1;
        int currentStreak = 1;
        
        for (int i = 1; i < arr.length; i++) {
            // Agar duplicate hai, toh skip karo
            if (arr[i] == arr[i - 1]) continue;
            
            // Agar consecutive hai
            if (arr[i] == arr[i - 1] + 1) {
                currentStreak++;
            } else {
                // Sequence toot gayi, longest update karo aur streak reset karo
                longest = Math.max(longest, currentStreak);
                currentStreak = 1;
            }
        }
        
        // Final check for the last sequence
        return Math.max(longest, currentStreak);
    }
}