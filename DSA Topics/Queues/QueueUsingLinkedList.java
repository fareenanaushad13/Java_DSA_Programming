public class QueueUsingLinkedList {
   static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
   }
   
    static class QueueB {
        static Node head = null;
        static Node tail = null;


        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // Add an element to the queue ---> O(1)
        public static void add(int data) {
           Node newNode = new Node(data);
           if(head == null){
                head = tail = newNode;
                return;
           }
           tail.next = newNode;
           tail = newNode;
        }

        // Remove an element from the queue ---> O(1)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
          int front = head.data;
          //single element
          if(tail == head){
            tail = head = null;
          }else{
            head =head.next;
          }
          return front;
        }

        // Peek the front element of the queue
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        QueueB q = new QueueB();
        q.add(3);
        q.add(6);
        q.add(1);
       
        while (!QueueB.isEmpty()) {
            System.out.println(QueueB.peek());
            QueueB.remove();
        }
    }
}
