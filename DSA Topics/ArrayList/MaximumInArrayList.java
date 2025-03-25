import java.util.ArrayList;
//Time Complexity: O(n)
public class MaximumInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<>();

        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(6);
        list.add(1);
        list.add(361);
        int max = Integer.MIN_VALUE;

        for(int i=0;i<list.size();i++){
            // if(max< list.get(i)){
            //     max = list.get(i);
            // }

            max = Math.max(max, list.get(i));
        }
        System.out.println("Maximum Element = " +  max);
    }
}
