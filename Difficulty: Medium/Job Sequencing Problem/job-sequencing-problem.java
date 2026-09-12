import java.util.*;

class Solution {
    // DSU Find function with Path Compression
    private int find(int i, int[] parent) {
        if (i == parent[i]) {
            return i;
        }
        return parent[i] = find(parent[i], parent); // Path compression
    }

    public ArrayList<Integer> jobSequencing(int[] d, int[] p) {
        int n = p.length;
        int[][] a = new int[n][2];
        int maxDeadline = 0;

        for (int i = 0; i < n; i++) {
            a[i][0] = d[i]; // Deadline
            a[i][1] = p[i]; // Profit
            if (d[i] > maxDeadline) {
                maxDeadline = d[i];
            }
        }

        // 1. Profit ke basis par Descending Order me sort karo
        Arrays.sort(a, (o1, o2) -> Integer.compare(o2[1], o1[1]));

        // 2. DSU parent array initialize karo
        int[] parent = new int[maxDeadline + 1];
        for (int i = 0; i <= maxDeadline; i++) {
            parent[i] = i;
        }

        int count = 0;
        int tp = 0;

        // 3. Process jobs
        for (int i = 0; i < n; i++) {
            int deadline = a[i][0];
            int profit = a[i][1];

            // Direct available slot dhoondo in O(α(N))
            int availableSlot = find(deadline, parent);

            // Agar slot 0 se bada hai, mtlb time slot available hai
            if (availableSlot > 0) {
                // Occupy slot & update parent (union with previous slot)
                parent[availableSlot] = find(availableSlot - 1, parent);
                count++;
                tp += profit;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(count);
        ans.add(tp);
        return ans;
    }
}