public class RemoveFirst {
    public static class  Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next =  null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode =  new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head =  newNode;
    }

    //removeFirst() method
    public int removeFirst(){
        if(size == 0){
            System.out.println("ll is Empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head =  tail =  null;
            size = 0;
            return val;
        }
        int val =  head.data;
        head =  head.next;
        size--;
        return val;
    }

    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        RemoveFirst ll =  new RemoveFirst();

        ll.addFirst(1);
        ll.addFirst(3);
        ll.addFirst(6);
        ll.addFirst(17);
        ll.print();
        
        ll.removeFirst();
        ll.print();
    }
}
