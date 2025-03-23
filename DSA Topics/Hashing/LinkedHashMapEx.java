import java.util.*;
public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("Australia", 120);
        lhm.put("China", 150);
        lhm.put("Us", 50);

        System.out.println(lhm); //LinkedHashMap maintains insertion order, whereas HashMap prints elements in a random order

    }
}
