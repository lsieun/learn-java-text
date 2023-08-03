package lsieun.text.sort;

import java.text.Collator;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class TextSort {
    public static void main(String[] args) {
        Collator instance = Collator.getInstance(Locale.CHINA);

        String[] array = {"春天", "夏天", "秋天", "冬天", "昨天", "今天", "明天", "晴天", "阴天", "雨天"};
        List<String> list = Arrays.asList(array);
        list.sort(instance);

        for (String item : list) {
            System.out.println(item);
        }
    }
}
