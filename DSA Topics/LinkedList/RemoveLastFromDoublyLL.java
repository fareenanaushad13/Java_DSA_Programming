public class RemoveLastFromDoublyLL {
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

         //remove Last
         public int removeLast(){
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
            tail= tail.prev;
            tail.next = null;
            size--;
            return val;
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
             RemoveLastFromDoublyLL ll = new RemoveLastFromDoublyLL();
             ll.addLast(1);
             ll.addLast(2);
             ll.addLast(3);
             ll.print();
             System.out.println("Size of Linked List before deletion: " + ll.size);
 
             ll.removeLast();
             ll.print();
             System.out.println("Size of Linked List after deletion: " + ll.size);
         }
}
