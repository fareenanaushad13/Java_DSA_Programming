//Time Complexity: O(1)
public class AddFirst{
    public static class  Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        //step1 -  Create new Node
        Node newNode =  new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        //step2  newNode next = head
        newNode.next = head;

        //step3  head = newNode
        head =  newNode;
    }
    public static void main(String[] args) {
        AddFirst ll = new AddFirst();
        ll.addFirst(1);
        ll.addFirst(3);
        ll.addFirst(6);

    }
}