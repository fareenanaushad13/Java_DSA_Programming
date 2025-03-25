import java.util.ArrayList;
//Time Complexity: O(n)
public class PrintReverse {
    public static void main(String args[]){
        ArrayList<Integer> list =  new ArrayList<>();

        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(6);
        list.add(1);

        for(int i=list.size()-1; i>=0;i--){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();
    }
}
