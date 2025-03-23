import java.util.HashSet;
// import java.util.Iterator;

//Time Complexity: O(n)

public class IterationOnHashSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Bangalore");
        cities.add("Ranchi");
        cities.add("Delhi");
        cities.add("Noida");
        cities.add("Hydarabad");
        cities.add("Chennai");

        // Iterator it = cities.iterator(); //using Iterator
        // while (it.hasNext()) {
        //     System.out.println(it.next()); //printed in an unordered list
        // }

        for(String city :  cities){ //using foreach loop
            System.out.println(city);
        }
    }
}
