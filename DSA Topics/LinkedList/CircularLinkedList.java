public class CircularLinkedList {
    static class Node {
        int data;
        Node next;
    }

    // Add to an empty list
    static Node addToEmpty(Node last, int data) {
        if (last != null)
            return last;
        Node newNode = new Node();
        newNode.data = data;
        last = newNode;
        newNode.next = last;
        return last;
    }

    // Add to the front
    static Node addFront(Node last, int data) {
        if (last == null)
            return addToEmpty(last, data);
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = last.next;
        last.next = newNode;
        return last;
    }

    // Add to the end
    static Node addEnd(Node last, int data) {
        if (last == null)
            return addToEmpty(last, data);
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = last.next;
        last.next = newNode;
        last = newNode;
        return last;
    }

    // Add after a specific item
    static Node addAfter(Node last, int data, int item) {
        if (last == null)
            return null;

        Node p = last.next;
        do {
            if (p.data == item) {
                Node newNode = new Node();
                newNode.data = data;
                newNode.next = p.next;
                p.next = newNode;

                if (p == last)
                    last = newNode;
                return last;
            }
            p = p.next;
        } while (p != last.next);

        System.out.println(item + " is not present in the list.");
        return last;
    }

    // Print the circular linked list
    static void printList(Node last) {
        if (last == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = last.next;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != last.next);
        System.out.println("back to start");
    }

    //Delete a Node
    static Node deleteNode(Node last, int key) {
        // If the list is empty
        if (last == null)
            return null;
    
        // If the list contains only one node and that node has the key
        if (last.data == key && last.next == last) {
            return null;
        }
    
        Node temp = last;
    
        // If the key is present in the first node (i.e., next to last)
        if (last.next.data == key) {
            while (temp.next != last.next) {
                temp = temp.next;
            }
            temp.next = last.next.next;
            if (last.next == last)
                return null;
            if (last.next == last) {
                last = null;
            } else {
                last.next = temp.next;
            }
            return last;
        }
    
        // For other nodes
        temp = last.next;
        while (temp.next != last.next && temp.next.data != key) {
            temp = temp.next;
        }
    
        if (temp.next.data == key) {
          
            if (temp.next == last)
                last = temp;
            temp.next = temp.next.next;
        } else {
            System.out.println("Node with data " + key + " not found.");
        }
    
        return last;
    }
    

    public static void main(String[] args) {
        Node last = null;
        last = addToEmpty(last, 8);
        last = addFront(last, 2);
        last = addAfter(last, 10, 2);
        last = addEnd(last, 5);

        printList(last);

        last = deleteNode(last, 10);
        printList(last);
    }
}
