package guojia.target.google;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ann on 12/25/16.
 */
public class BinaryWatch {
    /**
     * Input: n = 1
     Return: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]
     The order of output does not matter.
     The hour must not contain a leading zero, for example "01:00" is not valid, it should be "1:00".
     The minute must be consist of two digits and may contain a leading zero, for example "10:2" is not valid, it should be "10:02".
     */

    private final int[] hours = {1, 2, 4, 8};
    private final int[] mins = {1, 2, 4, 8, 16, 32};

    public List<String> readBinaryWatch(int num) {
        List<String> res = new ArrayList<>();
        if (num < 0 || num > 10) {
            return res;
        }
        for (int i = 0; i <= num; i++) {
            List<Integer> listHour = generate(hours, i);
            List<Integer> listMin = generate(mins, num - i);
            for (int hour : listHour) {
                if (hour >= 12) continue;
                for (int min : listMin) {
                    if (min >= 60) continue;
                    String sb = hour + ":" + ((min < 10)? "0" + min : min);
                    res.add(sb.toString());
                }
            }
        }
        return res;
    }

    private List<Integer> generate(int[] arr, int count) {
        List<Integer> res = new ArrayList<Integer>();
        generateDigitHelper(arr, count,0, 0, res);
        return res;
    }

    private void generateDigitHelper(int[] arr, int count, int index, int sum,  List<Integer> res) {
        if(count == 0) {
            res.add(sum);
            return;
        }

        for(int i = index; i < arr.length; i++) {
            generateDigitHelper(arr, count - 1, i + 1, sum + arr[i], res);
        }
    }

    public static void main(String[] args) {
        BinaryWatch solution = new BinaryWatch();
        solution.readBinaryWatch(4).forEach(s -> System.out.println(s));
    }
}
