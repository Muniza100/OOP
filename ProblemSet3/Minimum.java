import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(">>>");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        boolean equalityValidator = (number1 == number2 && number2 == number3);
        if (equalityValidator) {
            System.out.print("They are all equal");
        }
        else if (number1 <= number2 && number1 <= number3) {
            System.out.print("The least of these three numbers is " + number1);
        }
        else if (number2 <= number1 && number2 <= number3) {
            System.out.print("The least of these three numbers is " + number2);
        }
        else {
            System.out.print("The least of these three numbers is " + number3);
        }
    }
}
