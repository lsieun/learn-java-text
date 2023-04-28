package lsieun.text.format;

public class FormatWithB {
    public static void main(String[] args) {
        String s = String.format("The correct answer is %B", true);
        System.out.println(s); // The correct answer is TRUE
    }
}
