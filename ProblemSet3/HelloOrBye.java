import java.util.Scanner;

public class HelloOrBye {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(">>>");
        char letter = input.next().charAt(0);

        boolean hValidator = letter == 'h';
        boolean eValidator = letter == 'e';
        boolean lValidator = letter == 'l';
        boolean oValidator = letter == 'o';
        boolean wValidator = letter == 'w';
        boolean rValidator = letter == 'r';
        boolean dValidator = letter == 'd';
        boolean capitalHValidator = letter == 'H';
        boolean capitalEValidator = letter == 'E';
        boolean capitalLValidator = letter == 'L';
        boolean capitalOValidator = letter == 'O';
        boolean capitalWValidator = letter == 'W';
        boolean capitalRValidator = letter == 'R';
        boolean capitalDValidator = letter == 'D';
        boolean excalamationValidator = letter == '!';

        if (hValidator || eValidator || lValidator || oValidator || wValidator || rValidator || dValidator ||
                capitalHValidator || capitalEValidator || capitalLValidator || capitalOValidator ||
                capitalWValidator || capitalRValidator || capitalDValidator || excalamationValidator) {
            System.out.print("Hello");
        }
        else {
            System.out.print("Bye");
        }
    }
}
