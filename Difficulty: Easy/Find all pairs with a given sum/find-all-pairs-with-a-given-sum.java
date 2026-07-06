import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public pair[] allPairs(int target, int arr1[], int arr2[]) {
        // Step 1: arr1 ko sort karo taaki output ascending order mein aaye
        Arrays.sort(arr1);
        
        // Step 2: arr2 ke elements ko unki frequency (count) ke saath HashMap mein store karo
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            // Agar number pehle se hai toh count badha do, nahi toh 1 set kar do
            map.put(arr2[i], map.getOrDefault(arr2[i], 0) + 1);
        }
        
        ArrayList<pair> list = new ArrayList<>();
        
        // Step 3: Sorted arr1 par loop lagao
        for (int i = 0; i < arr1.length; i++) {
            int required = target - arr1[i];
            
            // Check karo ki required number map mein hai ya nahi
            if (map.containsKey(required)) {
                // Wo number kitni baar arr2 mein aaya tha, utni baar pair ko list mein add karo
                int count = map.get(required);
                for (int k = 0; k < count; k++) {
                    list.add(new pair(arr1[i], required));
                }
            }
        }
        
        // Step 4: ArrayList ko wapas pair array mein convert karke return kar do
        return list.toArray(new pair[0]);
    }
}