package guojia.target.google;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by ann on 12/22/16.
 */
public class NumberOfBoomeranges {
    /**
     * Input:
     [[0,0],[1,0],[2,0]]

     Output:
     2

     Explanation:
     The two boomerangs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]]
     */
    public int numberOfBoomerangs(int[][] points) {
        int res = 0;
        if (points == null || points.length == 0 || points[0].length == 0) {
            return 0;
        }
        for (int i = 0; i < points.length; i++) {
            Map<Integer, Set<int[] >> map = new HashMap<>();
            int[] a = points[i];
            for (int j = 0; j < points.length; j++) {
                int[] b = points[j];
                int distance = distance(a, b);
                if (!map.containsKey(distance)) {
                    map.put(distance, new HashSet<>());
                }
                map.get(distance).add(b);
            }
            for (int distance : map.keySet()) {
                int size = map.get(distance).size();
                if (size > 1) {
                    res += size * (size - 1);
                }
            }
        }
        return res;
    }

    /**
     * Distance
     */
    public int distance(int[] a, int[] b) {
        int x = a[0] - b[0];
        int y = a[1] - b[1];
        return x*x + y*y;
    }

    public static void main(String[] args) {


    }
}
