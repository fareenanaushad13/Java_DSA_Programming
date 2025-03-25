import java.util.ArrayList;
import java.util.Collections;

public class SortinganArrayList {
    public static void main(String[] args) {
         ArrayList<Integer> list =  new ArrayList<>();

        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(6);
        list.add(1);

        System.out.println(list);
        Collections.sort(list); //ascending
        System.out.println(list);

        //descending
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
