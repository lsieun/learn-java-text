package lsieun.text.split;

import java.util.Arrays;

public class TextSplitJdk {
    public static void main(String[] args) {
        String input = " car , jeep, scooter ";
        String[] splitted = Arrays.stream(input.split(","))
                .map(String::trim)
                .toArray(String[]::new);
        System.out.println(Arrays.toString(splitted));
    }
}
