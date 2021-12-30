import java.util.Scanner;

public class SplitSentence {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter the single line text please: ");
        String sentence = console.nextLine();

        splitSentence2Words(sentence);
    }

    private static boolean letterValidator(int characterUnicode) {
        return (characterUnicode > 64 && characterUnicode < 91) ||
                (characterUnicode > 96 && characterUnicode < 123);
    }

    private static void splitSentence2Words(String clause) {
        String[] words = clause.trim().split(" ");

        int word_counter = 0;
        while (word_counter < words.length) {
            int character_counter = 0;

            while (character_counter < words[word_counter].length()) {
                if (!letterValidator(words[word_counter].codePointAt(character_counter))) {

                    if (character_counter == 0){
                        words[word_counter] = words[word_counter].substring(1);
                    }
                    else if (character_counter == words[word_counter].length() - 1){
                        words[word_counter] = words[word_counter].substring(0,
                                character_counter);
                    }
                    else {
                        words[word_counter] = words[word_counter].substring(0,
                                character_counter) +
                                words[word_counter].substring(character_counter + 1);
                    }
                    character_counter--;
                }
                character_counter++;
            }
            word_counter++;
        }

        word_counter = 0;
        while (word_counter < words.length) {
            System.out.println(words[word_counter]);
            word_counter++;
        }
    }
}