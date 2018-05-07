package geekforgeeks.topquestions.dp;

/**
 * https://www.geeksforgeeks.org/longest-common-subsequence/
 */
public class LCS {

    public static int compute(String s1, String s2) {
        int[][] arr = new int[s1.length() + 1][s2.length() + 2];
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    arr[i][j] = arr[i - 1][j - 1] + 1;
                } else {
                    arr[i][j] = Math.max(arr[i - 1][j], arr[i][j - 1]);
                }
            }
        }
        return arr[s1.length()][s2.length()];
    }
}
