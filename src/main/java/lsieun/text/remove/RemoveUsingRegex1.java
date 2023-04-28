package lsieun.text.remove;

public class RemoveUsingRegex1 {
    public static String removeLeadingZeroes(String s) {
        return s.replaceAll("^0+", "");
    }

    public static String removeTrailingZeroes(String s) {
        return s.replaceAll("0+$", "");
    }
}
