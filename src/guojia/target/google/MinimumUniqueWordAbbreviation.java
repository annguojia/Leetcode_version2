package guojia.target.google;

/**
 * Created by ann on 12/24/16.
 */
public class MinimumUniqueWordAbbreviation {
    /**
     *     https://leetcode.com/problems/minimum-unique-word-abbreviation/
     *     Using backtracking
     */
    public String minAbbreviation(String target, String[] dictionary) {

        return "";
    }

    /**
     * "apple", ["blade"] -> "a4" (because "5" or "4e" conflicts with "blade")
     * "apple", ["plain", "amber", "blade"] -> "1p3" (other valid answers include "ap3", "a3e", "2p2", "3le", "3l1").
     Hide Company Tags
     * @param args
     */
    public static void main(String[] args) {
        MinimumUniqueWordAbbreviation solution = new MinimumUniqueWordAbbreviation();
        String target = "apple";
        String[] dictionary = new String[3];
        dictionary[0] = "plain";
        dictionary[1] = "amber";
        dictionary[2] = "blade";
        System.out.println(solution.minAbbreviation(target, dictionary));
    }

}
