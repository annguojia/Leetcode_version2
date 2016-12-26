package guojia.target.google;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ann on 12/22/16.
 */
public class MaxPointsOnALine {

    //Definition for a point.
    class Point {
        int x;
        int y;
        public void Point() { x = 0; y = 0; }
        public void Point(int a, int b) { x = a; y = b; }
     }

    public int maxPoints(Point[] points) {
        int res = 0;
        if (points == null || points.length == 0 ) {
            return res;
        }
        if (points.length <= 2) {
            return 1;
        }
        for (int i = 0; i < points.length; i++) {
            Map<Double, Integer> map = new HashMap<>();
            int sameP = 0;
            int sameX = 1;
            for (int j = 0; j < points.length; j++ ) {
                if (i != j) {
                    if ((points[i].x == points[j].x) && (points[i].y == points[j].y)) {
                        sameP++;
                    }
                    if (points[i].x == points[j].x) {
                        sameX++;
                        continue;
                    }
                    double slope = slope(points[i], points[j]);
                    if (map.containsKey(slope)) {
                        map.put(slope, map.get(slope) + 1);
                    } else {
                        map.put(slope, 2);
                    }
                    res = Math.max(res, map.get(slope) + sameP);
                }
                res = Math.max(res, sameX);
            }
        }
        return res;
    }

    public double slope(Point p1, Point p2) {
        if (p1.x == p2.x) {
            return Double.MAX_VALUE;
        } else if (p1.y == p2.y) {
            return 0;
        }
        return (double)(p1.y - p2.y)/(double) (p1.x - p2.x);

    }

}
