import java.util.*;

class Solution {
    // Function to sort the array according to frequency of elements.
    public ArrayList<Integer> sortByFreq(int arr[]) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        // 1. Frequency count karlo
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            list.add(num);
        }

        // 2. Custom Comparator se sort karo:
        // High frequency pehle, agar frequency equal ho toh smaller element pehle (GFG standard requirement)
        Collections.sort(list, (a, b) -> {
            int freqA = freqMap.get(a);
            int freqB = freqMap.get(b);

            if (freqA != freqB) {
                return freqB - freqA; // Decreasing order of frequency
            } else {
                return a - b;         // Increasing order of value (tie-breaker)
            }
        });

        return list;
    }
}