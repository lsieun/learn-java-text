package lsieun.text.remove;

import com.google.common.base.CharMatcher;

public class RemoveUsingGuava2 {
    public static String removeLeadingZeroes(String s) {
        String stripped = CharMatcher.is('0').trimLeadingFrom(s);
        if (stripped.isEmpty() && !s.isEmpty()) {
            return "0";
        }
        return stripped;
    }

    public static String removeTrailingZeroes(String s) {
        String stripped = CharMatcher.is('0').trimTrailingFrom(s);
        if (stripped.isEmpty() && !s.isEmpty()) {
            return "0";
        }
        return stripped;
    }
}
