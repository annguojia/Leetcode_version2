package guojia.target.google;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ann on 12/22/16.
 */
public class LineReflection {
    public boolean lineReflection(int[][] points) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Set<String> set = new HashSet<>();
        for (int[] point : points) {
            max = Math.max(max, point[0]);
            min = Math.min(min, point[0]);
            String str = point[0]+ "*" + point[1];
            set.add(str);
        }
        int sum = min + max;
        for (int[] point : points) {
            String str = (sum - point[0]) + "*" + point[1];
            if (!set.contains(str)) {
                return false;
            }
        }
        return true;
    }
}
