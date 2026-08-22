class Solution {
    Node removeDuplicates(Node head) {
        // Agar list khali hai ya single node hai toh wapas bhej do
        if (head == null || head.next == null) return head;

        Node curr = head;

        while (curr != null && curr.next != null) {
            Node nextNode = curr.next;

            // Jab tak agla node current ke barabar hai, aage badhte raho
            while (nextNode != null && nextNode.data == curr.data) {
                nextNode = nextNode.next;
            }

            // Curr ko directly unique node se connect karo
            curr.next = nextNode;
            if (nextNode != null) {
                nextNode.prev = curr;
            }

            // Curr ko aage badhao agle unique element ke liye
            curr = curr.next;
        }

        return head;
    }
}