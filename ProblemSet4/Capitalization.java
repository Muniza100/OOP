import java.util.Scanner;

public class Capitalization {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        System.out.print(capitalize(sentence));
    }

    public static String capitalize(String sentence){
        String[] words = sentence.strip().split(" ");
        StringBuilder capitalizedString = new StringBuilder();
        for (int wordIndex = 0; wordIndex < words.length; wordIndex++) {
            String firstCharacter = String.valueOf(words[wordIndex].charAt(0));
            int firstCharacterUnicode = firstCharacter.codePointAt(0);
            if ((firstCharacterUnicode >= 65 && firstCharacterUnicode <= 90) ||
                    (firstCharacterUnicode >= 97 && firstCharacterUnicode <= 122)) {
                words[wordIndex] = words[wordIndex].replaceFirst(firstCharacter, firstCharacter.toUpperCase()) + " ";
            }
            else {
                words[wordIndex] = words[wordIndex] + " ";
            }
            capitalizedString.append(words[wordIndex]);
        }
        return String.valueOf(capitalizedString);
    }
}