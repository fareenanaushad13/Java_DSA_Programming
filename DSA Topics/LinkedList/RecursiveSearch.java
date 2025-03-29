//Time Complexity: O(n)
public class RecursiveSearch {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode =  new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }
         tail.next = newNode;
         tail =  newNode;
    }

    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }

        if(head.data ==  key){
            return 0;
        }

        int idx = helper(head.next, key); //O(n)
        if(idx == -1){
            return -1;
        }
        return idx +1;
    }

    public int recSarch(int key){
        return helper(head, key);
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
        RecursiveSearch ll =  new RecursiveSearch();
    
        ll.addFirst(9);
        ll.addFirst(3);
        ll.addFirst(6);
        ll.addLast(8);
        ll.addLast(7);
        ll.addLast(5);
    
        ll.print();
    
        System.out.println(ll.recSarch(7)); //found at 4 index
        System.out.println(ll.recSarch(5)); //found at 5 index
        System.out.println(ll.recSarch(17)); // key not found // return -1
    }
}
