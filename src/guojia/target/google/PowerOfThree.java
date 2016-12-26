package guojia.target.google;

/**
 * Created by ann on 12/25/16.
 */
public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        return n > 0 && (Math.log(n) / Math.log(3)) % 1 == 0;
    }

    public static void main(String[] args) {
        System.out.println(Math.log(243)/Math.log(3));
        System.out.println(Math.log10(243)/Math.log10(3));
    }
}
