package guojia.target.facebook;

/**
 * Created by ann on 12/25/16.
 */
public class MultiplyString {
    /**
     * https://leetcode.com/problems/multiply-strings/
     *Given two numbers represented as strings, return multiplication of the numbers as a string.

     Note:
     The numbers can be arbitrarily large and are non-negative.
     Converting the input string to integer is NOT allowed.
     You should NOT use internal library such as BigInteger.
     */
    public String multiply(String num1, String num2) {
        int n = num1.length();
        int m = num2.length();
        int[] product = new int[n + m];
        for (int  i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                int x = num1.charAt(i) - '0';
                int y = num2.charAt(j) - '0';
                product[i + j + 1] += x * y;
            }
        }
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = n + m - 1; i >= 0 || carry == 1; i--) {
            sb.append((product[i] + carry)% 10);
            carry = (product[i] + carry)/ 10;
        }
        int i = sb.length() - 1;
        while(i >= 0 && sb.charAt(i) == '0') {
            sb.deleteCharAt(i--);
        }
        return (i < 0)? "0" :sb.reverse().toString();

    }

    public static void main(String[] args) {
        MultiplyString solution = new MultiplyString();
        System.out.println(solution.multiply("10", "10"));
    }
}
