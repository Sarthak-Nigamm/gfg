class Solution {
    public boolean canServe(int[] arr) {
        int five = 0, ten = 0;

        // Single loop to process passengers one by one in order
        for (int a : arr) {
            if (a == 5) {
                // Collect the $5 bill immediately
                five++;
            } 
            else if (a == 10) {
                // Check change first, then collect the $10 bill
                if (five > 0) {
                    five--;
                    ten++; // You safely collect the $10 now
                } else {
                    return false;
                }
            } 
            else if (a == 20) {
                // Check change for $15
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
                // Note: We don't increment a 'twenty' counter 
                // because we never use $20 bills to give change!
            }
        }

        return true;
    }
}
