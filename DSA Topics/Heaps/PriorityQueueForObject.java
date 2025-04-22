
import java.util.PriorityQueue;

public class PriorityQueueForObject {
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("far", 1));
        pq.add(new Student("farru", 2));
        pq.add(new Student("fari", 3));
        pq.add(new Student("faroo", 4));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + "->" +pq.peek().rank);// O(1))
            pq.remove(); // O(logn)
        }
    }
    
}