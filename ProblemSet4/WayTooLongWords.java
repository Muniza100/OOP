import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int counter = 0; counter < n; counter++) {
            String word = input.next();
            System.out.println(abbreviate(word));
        }
    }

    private static String abbreviate(String word) {
        if (word.length() <= 10) {
            return word;
        }
        else {
            String abbreviatedWord = "";
            abbreviatedWord += word.charAt(0);
            abbreviatedWord += String.valueOf(word.length() - 2);
            abbreviatedWord += word.charAt(word.length() - 1);
            return abbreviatedWord;
        }
    }
}