//Time Complexity: O(1)
import java.util.*;
public class IterationOnHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 360);
        hm.put("Dubai", 290);
        hm.put("SaudiArabia", 336);
        hm.put("Us", 200);
        hm.put("China", 150);

        //Iterate --> O(1)
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) { //foreach loop --> Iterates over an array
            System.out.println("key="+k+ ",value="+hm.get(k)); //HashMap prints in random order
        } 
    }
}
