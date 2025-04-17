import java.util.*;
//Time Complexity: O(n)

public class BaseBallGame {
    public int calPoints(String[] ops) {
        List<Integer> record = new ArrayList<>();

        for (String op : ops) {
            int size = record.size();

            switch (op) {
                case "C":
                    record.remove(size - 1);
                    break;

                case "D":
                    record.add(2 * record.get(size - 1));
                    break;

                case "+":
                    record.add(record.get(size - 1) + record.get(size - 2));
                    break;

                default:  // it's an integer
                    record.add(Integer.parseInt(op));
            }
        }

        // Sum all the valid scores
        int sum = 0;
        for (int score : record) {
            sum += score;
        }

        return sum;
    }

    public static void main(String[] args) {
        BaseBallGame game = new BaseBallGame();

        //Dry Run
        //"5" --> It’s an integer --> add to record --> record = [5]
        //"2" --> It’s an integer --> add to record --> record = [5, 2]
        //"C" --> Cancel previous score --> remove last --> record = [5]
        //"D" --> Double of last score --> 2 * 5 = 10 --> record = [5, 10]
        //"+" --> Sum of last two --> 5 + 10 = 15 --> record = [5, 10, 15]
        //Output --> Total = 5 + 10 + 15 = 30
        String[] ops1 = {"5", "2", "C", "D", "+"};
        System.out.println(game.calPoints(ops1)); // Output: 30

        String[] ops2 = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        System.out.println(game.calPoints(ops2)); // Output: 27

        //dry  Run
        //"1" --> It’s an integer --> add to record --> record = [1]
        //"C" --> Cancel previous score --> remove last --> record = []
        //Output --> Total = 0
        String[] ops3 = {"1", "C"};
        System.out.println(game.calPoints(ops3)); // Output: 0
    }
}