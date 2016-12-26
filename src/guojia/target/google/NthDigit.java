package guojia.target.google;

/**
 * Created by ann on 12/26/16.
 */
public class NthDigit {
    /**
     *Find the nth digit of the infinite integer sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...
     n is positive and will fit within the range of a 32-bit signed integer (n < 231).
     */
    public int findNthDigit(int n) {
        int len = 1;
        long count = 9;
        int start = 1;

        while (n > len * count) {
            n -= len * count;
            len += 1;
            count *= 10;
            start *= 10;
        }

        start += (n - 1) / len;
        String s = Integer.toString(start);
        return Character.getNumericValue(s.charAt((n - 1) % len));
    }

    public static void main(String[] args) {
        NthDigit solution = new NthDigit();
        System.out.println(solution.findNthDigit(15));
    }
}
