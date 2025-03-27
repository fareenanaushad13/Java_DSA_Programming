//Time Complexity: O(1)
public class AddLast{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next  =  newNode;
        tail = newNode;
    }


public static void main(String[] args) {
    AddLast ll =  new AddLast();
    ll.addLast(6);
    ll.addLast(3);
    ll.addLast(1);
}
}