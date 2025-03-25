import java.util.ArrayList;
public class SizeOfArrayList {
    public static void main(String[] args) {
        ArrayList<String> list =  new ArrayList<>();

        list.add("far");
        list.add("farru");
        list.add("fari");

        System.out.println(list);

        //print the arraylist
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();
    }
}
