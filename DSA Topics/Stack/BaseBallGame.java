import java.util.*;
// Time Complexity: O(n)

public class BaseBallGame {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();

        for (String op : ops) {
            switch (op) {
                case "C":
                    stack.pop();
                    break;

                case "D":
                    stack.push(2 * stack.peek());
                    break;

                case "+":
                    int top = stack.pop();
                    int secondTop = stack.peek();
                    stack.push(top);
                    stack.push(top + secondTop);
                    break;

                default:  // it's an integer
                    stack.push(Integer.parseInt(op));
            }
        }

        // Sum all the valid scores
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }

    public static void main(String[] args) {
        BaseBallGame game = new BaseBallGame();

        // Dry Run
        //"5" --> It’s an integer --> add to stack --> stack = [5]
        //"2" --> It’s an integer --> add to stack --> stack = [5, 2]
        //"C" --> Cancel previous score --> remove last --> stack = [5]
        //"D" --> Double of last score --> 2 * 5 = 10 --> stack = [5, 10]
        //"+" --> Sum of last two --> 5 + 10 = 15 --> stack = [5, 10, 15]
        //Output --> Total = 5 + 10 + 15 = 30
        String[] ops1 = {"5", "2", "C", "D", "+"};
        System.out.println(game.calPoints(ops1)); // Output: 30

        String[] ops2 = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        System.out.println(game.calPoints(ops2)); // Output: 27

        // Dry Run
        //"1" --> It’s an integer --> add to stack --> stack = [1]
        //"C" --> Cancel previous score --> remove last --> stack = []
        //Output --> Total = 0
        String[] ops3 = {"1", "C"};
        System.out.println(game.calPoints(ops3)); // Output: 0
    }
}
