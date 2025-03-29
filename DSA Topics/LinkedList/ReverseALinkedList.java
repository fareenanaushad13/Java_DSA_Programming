//Time Complexity: O(n)
public class ReverseALinkedList{

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

    public void addFirst(int data){
        Node newNode =  new Node(data);
        if(head ==  null){
            head =  tail =  newNode;
            return;
        }

        newNode.next =  head;
        head =  newNode;
    }

    public void print(){
        Node temp =  head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp =  temp.next;
        }
        System.out.println("null");
    }

    //reverse a LinkedList
    public void reverse(){ //O(n)
        Node prev= null;
        Node curr =  tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr =  next;
        }
        head =  prev;
    }

    public static void main(String[] args) {
        ReverseALinkedList ll =  new ReverseALinkedList();

        ll.addFirst(3);
        ll.addFirst(6);
        ll.addFirst(1);
        ll.addFirst(13);
        ll.addFirst(11);
        ll.addFirst(361);
        ll.addFirst(31);

        ll.print();
        ll.reverse();
        ll.print();

    }
}