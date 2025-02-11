public class CharToUpperCase {

    //Time Complexity: O(n)
    public static String toUpperCase(String str) {
        if (str == null || str.isEmpty()) return str; 
        
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(str.charAt(0))); 

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == ' ' && str.charAt(i) != ' ') {
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i)); 
            }
        }

        return sb.toString();
    }

    public static void main(String args[]) {
        String str = "hi!! i'm far's far!!!!";
        System.out.println(toUpperCase(str));
    }
}
