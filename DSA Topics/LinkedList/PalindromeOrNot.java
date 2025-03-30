//Time complexity: O(n)
//space Complecity: O(1)
public class PalindromeOrNot {
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

    public void print(){
        Node temp =  head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp =  temp.next;
        }
        System.out.println("null");
    }

    //slow fast Approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast =  head;

        while (fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow; //slow is my MidNode
    }

    public boolean checkPalindrome(){
        if(head == null || head.next == null ){
            return true;
        }
        //step1 - findMid
        Node midNode = findMid(head);

        //step2 - reverse 2nd half
        Node prev= null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; //right half head
        Node left = head;

        //step3 -  check left & right half
        while (right != null) {
            if(left.data != right.data){
                return false;
            }
            left =  left.next;
            right =  right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeOrNot ll =  new PalindromeOrNot();

        ll.addLast(7);
        ll.addLast(3);
        ll.addLast(6);
        ll.addLast(3);
        ll.addLast(7);

        ll.print();

        System.out.println(ll.checkPalindrome());
    }
}
