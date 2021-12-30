import java.util.Scanner;

public class SplitDigits {
    public static void main(String[] args) {
        splitDigits();
    }

    private static void splitDigits(){
        Scanner input = new Scanner(System.in);
        String number = input.next();
        if (number.length() == 5) {
            String[] digits = number.trim().split("");
            int digitCounter = 0;
            while (digitCounter < 5) {
                System.out.println(digits[digitCounter]);
                digitCounter++;
            }
        }
        else if (number.length() < 5) {
            System.out.print("Number is too short!");
        }
        else {
            System.out.print("Number is too long!");
        }
    }
}