class Solution {

    // Helper function: N se chhota ya barabar sabse bada 2^x dhoondhne ke liye
    private static int getMaxPowerOf2(int n) {
        int x = 0;
        while ((1 << x) <= n) {
            x++;
        }
        return x - 1; // 2^x <= n wale x ki value
    }

    public static int countSetBits(int n) {
        // Base Case: Agar n 0 ya usse chhota hai, toh 0 bits honge
        if (n <= 0) return 0;

        // Step 1: Max power of 2 (x) nikalo
        int x = getMaxPowerOf2(n);

        // Formula components:
        // 1. 0 se (2^x - 1) tak ke total set bits
        int bitsTill2PowerX = x * (1 << (x - 1));

        // 2. 2^x se n tak ke MSB (leftmost) 1s ki counting
        int msbFrom2PowerXToN = n - (1 << x) + 1;

        // 3. Remaining numbers par recursive call
        int rest = countSetBits(n - (1 << x));

        // Final Total Sum
        return bitsTill2PowerX + msbFrom2PowerXToN + rest;
    }
}