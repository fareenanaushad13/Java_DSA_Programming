public class RemoveCycle {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    // Detects if a cycle exists in the linked list
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true; // Cycle detected
            }
        }
        return false; // No cycle
    }

    // Removes a cycle 
    public static void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        // Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                cycle = true;
                break;
            }
        }

        if (cycle == false){
            return;
        }

        //find meeting point
        slow = head;
        Node prev = null; // Last node 
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Remove cycle -> last.next = null
        prev.next = null;
    }

    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp; // Creating a cycle

        System.out.println(isCycle()); //true

        removeCycle();

        System.out.println(isCycle()); // false
    }
}
