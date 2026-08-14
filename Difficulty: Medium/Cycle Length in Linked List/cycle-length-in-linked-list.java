/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/
class Solution {
    public int lengthOfLoop(Node head) {
        Node slow = head;
        Node fast = head;

        // Step 1: Detect Loop using Fast & Slow Pointers
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // Loop Found!
            if (slow == fast) {
                int count = 1;
                Node temp = slow;

                // Step 2: Count nodes in loop
                while (temp.next != slow) {
                    count++;
                    temp = temp.next;
                }
                return count;
            }
        }

        // No loop present
        return 0;
    }
}