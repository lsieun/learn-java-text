package lsieun.text.remove;

import com.google.common.base.CharMatcher;

public class RemoveUsingGuava1 {
    public static String removeLeadingZeroes(String s) {
        return CharMatcher.is('0').trimLeadingFrom(s);
    }

    public static String removeTrailingZeroes(String s) {
        return CharMatcher.is('0').trimTrailingFrom(s);
    }
}
