//Time Complexity: O(n)
public class IterativeSearch{
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

    //Iterative Search --- O(n)
    public int itrSearch(int key){
        Node temp = head;
        int i =0 ;

        while (temp != null) {
            if(temp.data == key){ //key found
                return i;
            }
            temp = temp.next;
            i++;
        }

        //key not found
        return -1;
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
    IterativeSearch ll =  new IterativeSearch();

    ll.addFirst(9);
    ll.addFirst(3);
    ll.addFirst(6);
    ll.addLast(8);
    ll.addLast(7);
    ll.addLast(5);

    ll.print();

    System.out.println(ll.itrSearch(6)); //found at 0 index
    System.out.println(ll.itrSearch(3)); //found at 1 index
    System.out.println(ll.itrSearch(13)); // key not found // return -1
}
}