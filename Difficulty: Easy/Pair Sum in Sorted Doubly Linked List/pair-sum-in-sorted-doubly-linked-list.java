class Solution {
    public ArrayList<ArrayList<Integer>> givenSumPairs(Node head, int k) {
        ArrayList<ArrayList<Integer>> ll = new ArrayList<>();

        // Edge case: agar list khali hai
        if (head == null) return ll;

        Node left = head;
        Node right = head;

        // Right pointer ko last node tak set karo
        while (right.next != null) {
            right = right.next;
        }

        // Condition checks if they haven't crossed each other
        while (left != null && right != null && left != right && left.prev != right) {
            int sum = left.data + right.data;

            if (sum == k) {
                // Bug Fix 2: Nayi list andar banani hai
                ArrayList<Integer> list = new ArrayList<>();
                list.add(left.data);
                list.add(right.data);
                ll.add(list);

                // Bug Fix 1: Pointers ko move karna zaroori hai
                left = left.next;
                right = right.prev;
            } 
            else if (sum > k) {
                // Sum zyada hai toh right ko peeche laao
                right = right.prev;
            } 
            else {
                // Sum kam hai toh left ko aage badhao
                left = left.next;
            }
        }

        return ll; 
    }
}