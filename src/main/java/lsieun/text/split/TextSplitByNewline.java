package lsieun.text.split;

import com.google.common.base.Splitter;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class TextSplitByNewline {
    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        String[] lines = "Line1\r\nLine2\r\nLine3".split(System.lineSeparator());
        System.out.println(Arrays.toString(lines));
    }

    private static void test2() {
        String[] lines1 = "Line1\nLine2\nLine3".split("\\r?\\n|\\r");
        String[] lines2 = "Line1\rLine2\rLine3".split("\\r?\\n|\\r");
        String[] lines3 = "Line1\r\nLine2\r\nLine3".split("\\r?\\n|\\r");

        System.out.println(Arrays.toString(lines1));
        System.out.println(Arrays.toString(lines2));
        System.out.println(Arrays.toString(lines3));
    }

    private static void test3() {
        String[] lines1 = "Line1\nLine2\nLine3".split("\\R");
        String[] lines2 = "Line1\rLine2\rLine3".split("\\R");
        String[] lines3 = "Line1\r\nLine2\r\nLine3".split("\\R");

        System.out.println(Arrays.toString(lines1));
        System.out.println(Arrays.toString(lines2));
        System.out.println(Arrays.toString(lines3));
    }

    private static void test4() {
        Pattern pattern = Pattern.compile("\\R");
        Stream<String> lines1 = pattern.splitAsStream("Line1\nLine2\nLine3");
        Stream<String> lines2 = pattern.splitAsStream("Line1\rLine2\rLine3");
        Stream<String> lines3 = pattern.splitAsStream("Line1\r\nLine2\r\nLine3");

        lines1.forEach(System.out::println);
        lines2.forEach(System.out::println);
        lines3.forEach(System.out::println);
    }

    private static void test5() {
        Stream<String> lines = "Line1\nLine2\rLine3\r\nLine4".lines();

        lines.forEach(System.out::println);
    }

    private static void test6() {
        List<String> resultList = Splitter.onPattern("\\R")
                .trimResults()
                .omitEmptyStrings()
                .splitToList("Line1\n\nLine2\rLine3\r\nLine4");
        System.out.println(resultList);
    }
}
