import java.util.*;
//Time Complexity:O(1)
public class StackUsingDeque {
    static class Stack{
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data){  //--->O(1)
            deque.addLast(data);
        }
        public int pop(){ //--->O(1)
            return deque.removeLast(); 
        }
        public int peek(){ //--->O(1)
            return deque.getLast();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("peek = " + s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
