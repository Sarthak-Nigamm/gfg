class Solution {
    public static boolean areRotations(String s1, String s2) {
        // Step 1: Length check
        if (s1.length() != s2.length()) {
            return false;
        }

        // Step 2: Concatenate s1 with itself
        String txt = s1 + s1;
        String pat = s2;

        // Step 3: Use KMP Pattern Searching to find pat in txt in O(N) time
        return kmpSearch(txt, pat);
    }

    private static boolean kmpSearch(String txt, String pat) {
        int n = txt.length();
        int m = pat.length();

        int[] lps = new int[m];
        computeLPS(pat, m, lps);

        int i = 0; // index for txt
        int j = 0; // index for pat

        while (i < n) {
            if (pat.charAt(j) == txt.charAt(i)) {
                i++;
                j++;
            }

            if (j == m) {
                return true; // Pattern found!
            } else if (i < n && pat.charAt(j) != txt.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    private static void computeLPS(String pat, int m, int[] lps) {
        int len = 0;
        int i = 1;
        lps[0] = 0;

        while (i < m) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }
}