package guojia.target.google;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ann on 12/25/16.
 */
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int res = 0;
        if (s == null || s.length() == 0) {
            return res;
        }
        Map<Character, Integer> map = new HashMap<>();
        char[] sChar = s.toCharArray();
        for (char c : sChar) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        boolean hasSingle = false;
        for (char c : map.keySet()) {
            if (map.get(c) % 2 == 0) {
                res += map.get(c);
            } else {
                hasSingle = true;
                res += map.get(c) - 1;
            }
        }
        return hasSingle?res + 1:res;
    }
}
