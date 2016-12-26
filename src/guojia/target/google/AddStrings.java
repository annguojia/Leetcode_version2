package guojia.target.google;

/**
 * Created by ann on 12/25/16.
 */
public class AddStrings {
    /**
     * Given two non-negative numbers num1 and num2 represented as string, return the sum of num1 and num2.
     Note:

     The length of both num1 and num2 is < 5100.
     Both num1 and num2 contains only digits 0-9.
     Both num1 and num2 does not contain any leading zero.
     You must not use any built-in BigInteger library or convert the inputs to integer directly.
     */
    public String addStrings(String num1, String num2) {
        if (num1 == null || num2 == null) {
            return (num1 == null) ? num2: num1;
        }
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for (int i = num1.length() - 1, j = num2.length() -1; (i >= 0 || j >= 0 || carry == 1); i--, j--) {
            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';
            sb.append((x + y + carry) % 10);
            carry = (x + y + carry) / 10;
        }
        return sb.reverse().toString();
    }
}
