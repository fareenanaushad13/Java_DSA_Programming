//Time Complexity: O(1)
public class CircularQueueUsingArray {
    static class QueueB {
        static int[] arr;
        static int size;
        static int rear;
        static int front;

        // Constructor to initialize the queue
        QueueB(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        // Check if the queue is empty
        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        // Check if the queue is full
        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Add an element to the queue ---> O(1)
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // Remove an element from the queue ---> O(1)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // Peek the front element of the queue
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        QueueB q = new QueueB(3);
        q.add(3);
        q.add(6);
        q.add(1);
       
        while (!QueueB.isEmpty()) {
            System.out.println(QueueB.peek());
            QueueB.remove();
        }
    }
}
