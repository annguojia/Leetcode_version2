package guojia.target.google;

/**
 * Created by ann on 12/25/16.
 */
public class FindDifference {
    public char findTheDifference(String s, String t) {
        int sRes = 0;
        int tRes = 0;
        for (char sChar : s.toCharArray()) {
            sRes += sChar;
        }
        for (char tChar : t.toCharArray()) {
            tRes += tChar;
        }

        return (char)(tRes - sRes);
    }
}
