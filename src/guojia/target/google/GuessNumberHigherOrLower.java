//package guojia.target.google;
//
///**
// * Created by ann on 12/24/16.
// */
///* The guess API is defined in the parent class GuessGame.
//     @param num, your guess
//     @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
//     int guess(int num); */
//public class GuessNumberHigherOrLower {
//
//    /**
//     * https://leetcode.com/problems/guess-number-higher-or-lower/
//     *
//     */
//    public int guessNumber(int n) {
//        int start = 1;
//        int end = n;
//        while (start + 1 < end) {
//            int mid = start + (end - start)/2;
//            if (guess(mid) == 0) {
//                return mid;
//            } else if (guess(mid) == -1) {
//                start = mid + 1;
//            } else {
//                end = mid - 1;
//            }
//        }
//        if (guess(start) == 0) {
//            return start;
//        }
//        return end;
//    }
//
//    public static void main(String[] args) {
//
//    }
//}
