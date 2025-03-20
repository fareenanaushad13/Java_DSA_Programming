//Time Complexity: O(n * m)
public class EditDistance {
    public static int editDistance(String str1, String str2) {
        int n = str1.length(); //convert string1 to string2
        int m = str2.length();

        int dp[][] = new int[n + 1][m + 1];
        // initialization
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (i == 0) { //0th row
                    dp[j][j] = j;
                }
                if (j == 0) { //0th column
                    dp[i][j] = i;
                }
            }
        }
        // bottom up
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) { // same
                    dp[i][j] = dp[i - 1][j - 1];
                } else { // different
                    int add = dp[i][j - 1] + 1; //add operation
                    int del = dp[i - 1][j] + 1; //delete operation
                    int rep = dp[i - 1][j - 1] + 1; //replace operation
                    dp[i][j] = Math.min(add, Math.min(del, rep));
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String word1 = "intention"; //convert intention to execution
        String word2 = "execution";
        System.out.println(editDistance(word1, word2));
    }
}
