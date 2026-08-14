/* Structure of Doubly Linked List
class Node {
    int data;
    Node next;
    Node prev;

    Node(int x) {
        data = x;
        next = null;
        prev = null;
    }
}
*/

class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        Node curr = head;

        while (curr != null) {
            if (curr.data == x) {
                // Next node ko temporarily save kar lo traversal ke liye
                Node nextNode = curr.next;

                // Case 1: Agar target node HEAD hai
                if (curr == head) {
                    head = curr.next;
                }

                // Case 2: Agar PREV node exist karti hai (Middle or Tail deletion)
                if (curr.prev != null) {
                    curr.prev.next = curr.next;
                }

                // Case 3: Agar NEXT node exist karti hai
                if (curr.next != null) {
                    curr.next.prev = curr.prev;
                }

                curr = nextNode; // Next node par move karein
            } else {
                curr = curr.next; // Target match nahi hua, simply aage badhein
            }
        }

        return head;
    }
}