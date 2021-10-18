import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.print(reverseString(s));
            System.out.println(" <> " + s + " - " + isPalindrome(s));
        }
    }
    public static String reverseString(String s){//Реверс строки
        return new StringBuilder(s).reverse().toString();

    }
    public static boolean isPalindrome(String s){//Сравнение с предыдущим
        String s1= String.valueOf(new StringBuilder(s).reverse());
        return s1.toLowerCase(Locale.ROOT).equals(s.toLowerCase(Locale.ROOT));
    }

}