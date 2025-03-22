import java.util.HashMap;

public class HashMapOperation {
    public static void main(String[] args) {
        //create HashMap----> O(1)
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert ----->O(1)
        hm.put("India", 360);
        hm.put("Dubai", 290);
        hm.put("SaudiArabia", 336);
        hm.put("Us", 200);
        hm.put("China", 150);

        System.out.println(hm);

        //Get --> O(1)
        int population = hm.get("India"); // print --> key(India) Found in the HashMap
        System.out.println(population);
        
        System.out.println(hm.get("Australia")); //print null-->  does not exist in the HashMap

        //containsKey --> O(1)
        System.out.println(hm.containsKey("SaudiArabia")); //true--> exist

        System.out.println(hm.containsKey("Indonesia")); //false --> does not exist

        //Remove  --> O(1)
        System.out.println(hm.remove("China"));// removed
        System.out.println(hm.remove("Pakistan")); //print null --> not found in the hashmap
        System.out.println(hm);

        //size -- O(1)
        System.out.println(hm.size());

        //Is Empty && // Clear
        hm.clear(); //true --> will clear hashmap
        System.out.println(hm.isEmpty()); //false

    }
    
}