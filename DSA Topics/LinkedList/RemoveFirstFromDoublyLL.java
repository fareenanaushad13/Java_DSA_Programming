public class RemoveFirstFromDoublyLL {
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

        //addFirst
        public void addFirst(int data){
            Node newNode = new Node(data);
            size++;
            if(head == null){
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        //removeFirst
        public int removeFirst(){
            if(head == null){
                System.out.println("DLL is empty");
                return Integer.MIN_VALUE;
            }
                if(size == 1){
                int val = head.data;
                head = tail = null;
                size--;
                return val;
            }
            int val = head.data;
            head = head.next;
            head.prev = null;
            size --;
            return val;
            
        }

        //print
        public void print(){
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "<->");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public static void main(String[] args) {
            RemoveFirstFromDoublyLL ll = new RemoveFirstFromDoublyLL();
            ll.addFirst(4);
            ll.addFirst(3);
            ll.addFirst(2);
            ll.addFirst(1);

            ll.print();
            System.out.println(ll.size);

            ll.removeFirst();
            ll.print();
            System.out.println(ll.size);
        }
}
