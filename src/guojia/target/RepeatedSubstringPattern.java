package guojia.target;

/**
 * Created by ann on 12/25/16.
 */
public class RepeatedSubstringPattern {
    /**
     * Given a non-empty string check if it can be constructed by taking a substring of it
     * and appending multiple copies of the substring together.
     * You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.
     *
     *
     Input: "abcabcabcabc"

     Output: True

     Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
     * @param str
     * @return
     */
    public boolean repeatedSubstringPattern(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int len = str.length();
        for (int i = len / 2 ; i > 0; i--) {
            if (len % i == 0) {
                String pattern = str.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int k = 0; k < len/i; k++) {
                    sb.append(pattern);
                }
                if (sb.toString().equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        RepeatedSubstringPattern solution = new RepeatedSubstringPattern();
        System.out.println(solution.repeatedSubstringPattern("bb"));
    }
}
