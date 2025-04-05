public class AddEndToDoublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node (int data){
            this.data = data;
            this.next= null;
            this.prev=  null;
        }
    }
        public static Node head;
        public static Node tail;
        public static int size; 

        //AddEnd
        public void addLast(int data){
           Node newNode  = new Node(data);
           size++;
           if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        }

        public void print(){
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "<->");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public static void main(String[] args) {
            AddEndToDoublyLL ll = new AddEndToDoublyLL();
            ll.addLast(1);
            ll.addLast(2);
            ll.addLast(3);

            ll.print();
            System.out.println(ll.size);
        }
}
