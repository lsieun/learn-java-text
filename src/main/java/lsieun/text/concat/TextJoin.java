package lsieun.text.concat;

import java.util.List;

public class TextJoin {
    public static void main(String[] args) {
        List<String> strings = List.of("Java", "is", "cool");
        String message = String.join(" ", strings);
        System.out.println(message);
    }
}
