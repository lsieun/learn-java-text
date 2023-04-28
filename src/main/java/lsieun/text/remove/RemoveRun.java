package lsieun.text.remove;

import java.util.function.Function;

public class RemoveRun {

    public static void main(String[] args) {
        Function<String, String> func1 = RemoveUsingRegex2::removeLeadingZeroes;
        Function<String, String> func2 = RemoveUsingRegex2::removeTrailingZeroes;

        String[] array = {
                // 整数
                "0",
                "000",
                "1000",
                "0100",
                "0010",
                "0001",

                // 小数
                "0.00",
                "3.1400",
                "003.1400",

        };

        for (String item : array) {
            String str1 = func1.apply(item);
            String str2 = func2.apply(item);
            String str3 = func2.apply(str1);
            String str4 = func1.apply(str2);

            String info = String.format("|%s| - |%s| - |%s| - |%s| - |%s|", item, str1, str2, str3, str4);
            System.out.println(info);
        }
    }

}
