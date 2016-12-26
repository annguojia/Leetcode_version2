package guojia.target.google;

/**
 * Created by ann on 12/25/16.
 */
public class ReverseVowelsOfAString {
    /**
     * Write a function that takes a string as input and reverse only the vowels of a string.

     Example 1:
     Given s = "hello", return "holle".

     Example 2:
     Given s = "leetcode", return "leotcede".

     Note:
     The vowels does not include the letter "y"
     * @param s
     * @return
     */
    public String reverseVowels(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        int start = 0;
        int end = s.length() - 1;
        char[] sArray = s.toCharArray();
        while(start < end) {
            while(start < end && !isVowel(sArray[start])) {
                start++;
            }
            while(end > start && !isVowel(sArray[end])) {
                end--;
            }
            char temp = sArray[start];
            sArray[start] = sArray[end];
            sArray[end] = temp;
            start++;
            end--;
        }
        return new String(sArray);
    }

    public boolean isVowel(char c) {
        if (c == 'a' || c == 'o' || c == 'i'|| c == 'e' || c == 'u') {
            return true;
        }
        if (c == 'A' || c == 'O' || c == 'I'|| c == 'E' || c == 'U') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ReverseVowelsOfAString solution = new ReverseVowelsOfAString();
        System.out.println(solution.reverseVowels("Aa"));
    }
}
