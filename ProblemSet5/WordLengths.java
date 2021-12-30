import java.util.Scanner;

public class WordLengths {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        String inputLine = input.nextLine();
        wordLengths(inputLine);
    }

    public static void wordLengths(String words) {
        words = words.strip();
        String unnecessarySymbols = ".(){},!\"^/?-@:<[]|*";
        for (int symbolCounter = 0; symbolCounter < unnecessarySymbols.length(); symbolCounter++) {
            words = words.replaceAll(String.valueOf(unnecessarySymbols.charAt(symbolCounter)), "");
        }
        String[] wordsArray = words.split(" ");
        for (int wordCounter = 1; wordCounter < wordsArray.length + 1; wordCounter++) {
            String word = wordsArray[wordCounter - 1];
            String digits = "1234567890";
            for (int digitCounter = 0; digitCounter < unnecessarySymbols.length(); digitCounter++) {
                words = words.replaceAll(String.valueOf(digits.charAt(digitCounter)), "");
            }
            System.out.printf("%d: %d\t%s\n", wordCounter, word.length(), "*".repeat(word.length()));
        }
    }
}
