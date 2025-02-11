public class StringCompression {
    public static String compress(String str) {
        if (str == null || str.isEmpty()) return str;

        StringBuilder newStr = new StringBuilder();
        int i = 0;

        while (i < str.length()) {
            char currentChar = str.charAt(i);
            int count = 1;

            // Count consecutive repeating characters
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            newStr.append(currentChar); 
            
            if (count > 1) {
                newStr.append(count); 
            }
            
            i++;
        }

        return newStr.toString();
    }

    public static void main(String[] args) {
        String str = "ffaarreaannmea";
        System.out.println(compress(str));
    }
}
