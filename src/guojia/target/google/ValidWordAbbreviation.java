package guojia.target.google;

/**
 * Created by ann on 12/22/16.
 */
public class ValidWordAbbreviation {
    /**
     * internationalization
     * i12iz4nj
     * @param word
     * @param abbr
     * @return
     */
    public boolean validWordAbbreviation(String word, String abbr) {
        if (word == null && abbr == null ) {
            return true;
        }
        if (abbr == null || word == null) {
            return false;
        }
        char[] wordChar = word.toCharArray();
        char[] abbrChar = abbr.toCharArray();
        int i = 0;
        int j = 0;
        int cur = 0;
        while(i < wordChar.length && j < abbrChar.length) {
            cur = 0;
            if (!isNumber(abbrChar[j])) {
                if (wordChar[i] != abbrChar[j]) {
                    return false;
                } else {
                    i++;
                    j++;
                }
            } else {
                while (isNumber(abbrChar[j]) && j < abbrChar.length) {
                    cur = cur * 10 + (abbrChar[j] - '0');
                    j++;
                }
                i = i + cur;
            }

        }
        if (i == wordChar.length && j == abbrChar.length) {
            return true;
        }
        return false;
    }

    public boolean isNumber(char c) {
        if (c >=  '0' && c <= '9') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ValidWordAbbreviation test = new ValidWordAbbreviation();
        System.out.println(test.validWordAbbreviation("internationalization", "i12iz4n"));
    }
}
