//Time Complexy: O(1)
import java.util.*;
public class QueueUsingJCF {
    public static void main(String[] args) {
       // QueueB q = new QueueB();
      // Queue<Integer> q = new LinkedList<>(); //LinkedList
      Queue<Integer> q = new ArrayDeque<>(); //ArrauDeque
        q.add(3);
        q.add(6);
        q.add(1);
       
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
