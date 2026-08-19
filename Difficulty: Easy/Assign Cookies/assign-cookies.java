class Solution {
    public int maxChildren(int[] g, int[] s) {
        // code here
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0; // Child pointer
        int j = 0; // Cookie pointer

        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                i++; // Child satisfied! Next child par jao
            }
            j++; // Lagayiya cookie (chahe feed hua ho ya nahi, search next)
        }

        return i;
    }
}