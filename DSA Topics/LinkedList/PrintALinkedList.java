//Time Complexity: addFirst , addLast----O(1)
                // print() --- O(n)
public class PrintALinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // addFirst() Method--- O(1) //constant
    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //addLast() Method ----> O(1) //constant
    public void addLast(int data){
        Node newNode =  new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }
         tail.next = newNode;
         tail =  newNode;
    }

    //print ----> O(n) //linear
    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        PrintALinkedList ll =  new PrintALinkedList();
        ll.print();
        ll.addFirst(7);
        ll.print();
        ll.addFirst(3);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(6);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(1);
        ll.print();
    }

}
