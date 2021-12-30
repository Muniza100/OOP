import java.util.Scanner;

public class LettersSpacesNumbers {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        String inputLine = input.nextLine();
        int letters = 0, spaces = 0, numbers = 0, others = 0;
        for (int characterIndex = 0; characterIndex < inputLine.length(); characterIndex++) {
            if (Character.isAlphabetic(inputLine.charAt(characterIndex))) {
                letters++;
            }
            else if (inputLine.charAt(characterIndex) == ' ') {
                spaces++;
            }
            else if (Character.isDigit(inputLine.charAt(characterIndex))) {
                numbers++;
            }
            else {
                others++;
            }
        }
        System.out.printf("letter: %d%nspace: %d%nnumber: %d%nother: %d", letters, spaces, numbers, others);
    }
}
