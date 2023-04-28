package lsieun.text.format;

public class FormatWithS {
    public static void main(String[] args) {
        String s = String.format("The correct answer is %s", false);
        System.out.println(s); // The correct answer is false

        String helloWorld = String.format("|%30.5s|", "Hello World");
        System.out.println(helloWorld);
    }
}
