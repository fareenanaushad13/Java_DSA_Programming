public class RemoveLast {
    public static class  Node {
        int data;
        Node next;

        public Node (int data){
            this.data = data;
            this.next =  null;
        }
    }
    public static Node head;
    public static Node tail;
    public int size;

    public void addLast(int data){
        Node newNode =  new Node(data);
        size++;

        if(head == null){
            head = tail =  newNode;
            return;
        }
        tail.next = newNode;
        tail =  newNode;
    }

    //removeLast()Method
    public int removeLast(){
        if(size == 0){
            System.out.println("ll is Empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head =  tail =  null;
            size = 0;
            return val;
        }

        //prev -->i = size -2
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }
        int val =  prev.next.data; //tail.data
        prev.next = null;
        tail = prev;
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
        RemoveLast ll =  new RemoveLast();

        ll.addLast(7);
        ll.addLast(6);
        ll.addLast(5);
        ll.addLast(1);
        ll.addLast(2);

        ll.print();

        ll.removeLast();
        ll.print();

        System.out.println("Size Of a Linked List:" + ll.size);
    }
}
