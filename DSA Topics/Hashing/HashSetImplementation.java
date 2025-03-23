import java.util.HashSet;

public class HashSetImplementation {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(3);
        set.add(6);
        set.add(1);
        set.add(7);
        set.add(5);
        set.add(3);
        set.add(5);

        System.out.println(set);
        set.clear();
        System.out.println(set.size());
        System.out.println(set.isEmpty());


        set.remove(5);
        if(set.contains(5)){
            System.out.println("set contains 2");
        }
        // if(set.contains(8)){
        //     System.out.println("set contains 3"); // Do not print anything if it does not exist
        // }
    }
}
