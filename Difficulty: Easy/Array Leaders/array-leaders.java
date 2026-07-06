import java.util.ArrayList;
import java.util.Collections;

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        
        // Step 1: Array ka sabse aakhiri element hamesha leader hota hai
        int maxFromRight = arr[n - 1];
        list.add(maxFromRight);
        
        // Step 2: Array ko second-last element se leke first element tak ulta traverse karo
        for (int i = n - 2; i >= 0; i--) {
            // Agar current element right side ke ab tak ke maximum se bada ya barabar hai
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i]; // Naya max update karo
                list.add(maxFromRight); // List mein leader ko add karo
            }
        }
        
        // Step 3: Kyunki humne ulta check kiya hai, list mein leaders reverse order mein add hue hain.
        // Original left-to-right order maintain karne ke liye list ko reverse kar do.
        Collections.reverse(list); 
        
        return list;
    }
}