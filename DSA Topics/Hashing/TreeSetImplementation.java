import java.util.TreeSet;

public class TreeSetImplementation {
    public static void main(String[] args) {
        TreeSet<String> cities = new TreeSet<>();

        cities.add("Bangalore");
        cities.add("Ranchi");
        cities.add("Delhi");
        cities.add("Noida");
        cities.add("Hydarabad");
        cities.add("Chennai");

        System.out.println(cities); //printed in a sorted order
    }
}
