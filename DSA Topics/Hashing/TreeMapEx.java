import java.util.TreeMap;
//(O logn)
public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("Australia", 120);
        tm.put("China", 150);
        tm.put("Us", 50);
        tm.put("Pakistan", 8);

        System.out.println(tm); //Printed in key sorted order (A → Z)//Autralia-->China....
    }
}
