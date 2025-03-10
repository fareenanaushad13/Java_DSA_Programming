import java.util.Arrays;
//if two strings contains the same characters but in diffrent order,they can be said to be anagrams
//eg- (race and care) or (far and far) or (earth and heart)
public class Anagrams {
    public static void main(String args[]) {
        String str1 = "far";
        String str2 = "farru";

        // Convert strings to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Check if lengths are the same
        if (str1.length() == str2.length()) {
            // Convert strings into char arrays
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            // Sort both char arrays
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            // Check if the sorted char arrays are equal
            boolean result = Arrays.equals(str1charArray, str2charArray);

            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
            }
        } else {
            // Case when lengths are not equal
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
        }
    }
}
