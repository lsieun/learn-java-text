package lsieun.text.split;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class TextSplitApache {
    public static void main(String[] args) {
        String[] splitted1 = StringUtils.split("car jeep scooter");
        System.out.println(Arrays.toString(splitted1));

        String[] splitted2 = StringUtils.split("car   jeep  scooter");
        System.out.println(Arrays.toString(splitted2));
    }
}
