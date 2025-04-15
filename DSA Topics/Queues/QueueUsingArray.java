//Time Complexity: -- Add -->O(1)
                 //--Remove --> O(n)
public class QueueUsingArray {
    static class QueueB {
        int arr[];
        int size;
        int rear;

        // Constructor to initialize the queue
        QueueB(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // Check if the queue is empty
        public boolean isEmpty() {
            return rear == -1;
        }

        // Add an element to the queue --->O(1)
        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // Remove an element from the queue --->O(n)
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            // Shift all elements to the left
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        // Peek the front element of the queue
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        QueueB q = new QueueB(5);
        q.add(3);
        q.add(6);
        q.add(1);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
