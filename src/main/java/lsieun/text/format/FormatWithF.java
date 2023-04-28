package lsieun.text.format;

public class FormatWithF {
    public static void main(String[] args) {
        String str = String.format("Math.PI = |%-10.3f|", Math.PI);
        System.out.println(str);
    }
}
