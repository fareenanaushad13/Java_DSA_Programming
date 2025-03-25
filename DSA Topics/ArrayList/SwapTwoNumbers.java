import java.util.ArrayList;

public class SwapTwoNumbers {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);

    }
    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<>();

        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(6);
        list.add(1);
        list.add(361);

        int idx1 = 1, idx2 = 6;
        System.out.println(list);
        swap(list, idx1, idx2);
        System.out.println(list);
    }
}
