package lsieun.text.remove;

import org.apache.commons.lang3.StringUtils;

public class RemoveUsingApache1 {
    public static String removeLeadingZeroes(String s) {
        return StringUtils.stripStart(s, "0");
    }

    public static String removeTrailingZeroes(String s) {
        return StringUtils.stripEnd(s, "0");
    }
}
