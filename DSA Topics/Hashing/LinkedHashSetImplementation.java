import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetImplementation {
     public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Bangalore");
        cities.add("Ranchi");
        cities.add("Delhi");
        cities.add("Noida");
        cities.add("Hydarabad");
        cities.add("Chennai");

        System.out.println(cities);  //printed in an unordered list

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Bangalore");
        lhs.add("Ranchi");
        lhs.add("Delhi");
        lhs.add("Noida");
        lhs.add("Hydarabad");
        lhs.add("Chennai");

        System.out.println(lhs); //printed in an ordered list
}
}
