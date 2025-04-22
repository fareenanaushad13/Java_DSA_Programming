import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueInJCF {
    public static void main(String[] args) {

        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // reverse order

        pq.add(3); // o(logn)
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());// O(1))
            pq.remove(); // O(logn)
        }
    }
}