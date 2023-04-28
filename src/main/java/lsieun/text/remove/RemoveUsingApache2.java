package lsieun.text.remove;

import org.apache.commons.lang3.StringUtils;

public class RemoveUsingApache2 {
    public static String removeLeadingZeroes(String s) {
        String stripped = StringUtils.stripStart(s, "0");
        if (stripped.isEmpty() && !s.isEmpty()) {
            return "0";
        }
        return stripped;
    }

    public static String removeTrailingZeroes(String s) {
        String stripped = StringUtils.stripEnd(s, "0");
        if (stripped.isEmpty() && !s.isEmpty()) {
            return "0";
        }
        return stripped;
    }
}
