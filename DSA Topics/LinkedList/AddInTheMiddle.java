public class AddInTheMiddle {
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

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Insert at Middle -----> O(n)
    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i< idx - 1) {
            temp = temp.next;
            i++;
        }
        //i - idx -1--> temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public static void main(String[] args) {
        AddInTheMiddle ll = new AddInTheMiddle();
        ll.addFirst(3);
        ll.addFirst(5);
        ll.addFirst(7);
        ll.add(2, 6);

        ll.print();
    }
}
