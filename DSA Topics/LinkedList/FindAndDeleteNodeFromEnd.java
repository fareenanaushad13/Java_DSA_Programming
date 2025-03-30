//Time Complexity: O(n)
public class FindAndDeleteNodeFromEnd {
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

    //Find And Delete
    public void DeleteNthFromEnd(int n){
        //calculate size
        int sz = 0;
        Node temp =  head;
        while(temp != null){
            temp =  temp.next;
            sz++;
        }

        if(n == sz){
            head =  head.next;
            return;
        }

        //sz - n
        int  i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i <  iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next =  prev.next.next;
        return;
    }

    public void print(){
        Node temp =  head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp =  temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        FindAndDeleteNodeFromEnd ll =  new FindAndDeleteNodeFromEnd();

        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(1);

        ll.print();
        ll.DeleteNthFromEnd(3);
        ll.print();
    }
}
