import java.util.ArrayList;

public class OperationOnArrayList{
    public static void main(String[] args) {
        
    ArrayList<Integer> list =  new ArrayList<>();
    // ArrayList<String> list1  =  new ArrayList<>();
    // ArrayList<Boolean> list2 = new ArrayList<>();

    list.add(1); //O(1)
    list.add(3);
    list.add(6);
    list.add(1);
    list.add(7);

    list.add(0, 1); //O(n)

    System.out.println(list);

    //Get Operation ----> O(1)
    int element = list.get(3);
    System.out.println(element);

    //Delete ----> O(n)
    list.remove(0);
    System.out.println(list);

    //set element at Index ---> O(n)
    list.set(0,3);
    System.out.println(list);

    //contains element ----> O(n)
    System.out.println(list.contains(0));
    System.out.println(list.contains(7));
    
}
}
