import java.util.LinkedList;

public class LinkedListInJavaCollectionFramework {
    public static void main(String[] args) {
        //create
        LinkedList<Integer> ll =  new LinkedList<>();

        //add
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        System.out.println(ll);

        //remove
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
    
}