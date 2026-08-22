import java.util.Arrays;

class Solution {
    // Helper class to store items together
    static class Item {
        int val, wt;
        double ratio;

        public Item(int val, int wt) {
            this.val = val;
            this.wt = wt;
            this.ratio = (double) val / wt;
        }
    }

    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        int n = val.length;
        Item[] items = new Item[n];

        // Populate the items array
        for (int i = 0; i < n; i++) {
            items[i] = new Item(val[i], wt[i]);
        }

        // Sort items by value-to-weight ratio in descending order
        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));

        double totalValue = 0.0;

        // Greedily pick items
        for (int i = 0; i < n; i++) {
            if (capacity == 0) break;

            if (capacity >= items[i].wt) {
                // Take the whole item
                capacity -= items[i].wt;
                totalValue += items[i].val;
            } else {
                // Take the fractional part of the item
                totalValue += items[i].ratio * capacity;
                capacity = 0; // Knapsack is full
            }
        }

        return totalValue;
    }
}