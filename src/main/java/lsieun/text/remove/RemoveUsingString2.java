package lsieun.text.remove;

public class RemoveUsingString2 {
    public static String removeLeadingZeroes(String s) {
        int index;
        for (index = 0; index < s.length() - 1; index++) {
            if (s.charAt(index) != '0') {
                break;
            }
        }
        return s.substring(index);
    }

    public static String removeTrailingZeroes(String s) {
        int index;
        for (index = s.length() - 1; index > 0; index--) {
            if (s.charAt(index) != '0') {
                break;
            }
        }
        return s.substring(0, index + 1);
    }
}
