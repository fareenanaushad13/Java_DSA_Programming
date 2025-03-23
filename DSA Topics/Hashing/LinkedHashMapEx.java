import java.util.*;
public class LinkedHashMapEx {
    public static void main(String[] args) {
        //LinkedHashMap
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("Australia", 120);
        lhm.put("China", 150);
        lhm.put("Us", 50);

        //HashMap
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("Australia", 120);
        hm.put("China", 150);
        hm.put("Us", 50);

        System.out.println(lhm); //LinkedHashMap maintains insertion order(India-->Autralia--..), whereas HashMap prints elements in a random order
        System.out.println(hm);
    }
}
