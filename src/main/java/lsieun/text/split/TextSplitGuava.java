package lsieun.text.split;

import com.google.common.base.Splitter;

import java.util.List;

public class TextSplitGuava {
    public static void main(String[] args) {
        List<String> resultList = Splitter.on(',')
                .trimResults()
                .omitEmptyStrings()
                .splitToList("car,jeep,, scooter");
        System.out.println(resultList);
    }
}
