import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        String[] expression = input.nextLine().strip().split(" ");
        int operand1 = Integer.parseInt(expression[0]), operand2 = Integer.parseInt(expression[2]);
        switch (expression[1]) {
            case "+":
                System.out.println(addition(operand1, operand2));
                break;
            case "-":
                System.out.println(subtraction(operand1, operand2));
                break;
            case "*":
                System.out.println(multiplication(operand1, operand2));
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("Error");
                }
                else {
                    System.out.println(division(operand1, operand2));
                }
                break;
            case "%":
                if (operand2 == 0) {
                    System.out.println("Error");
                }
                else {
                    System.out.println(remainder(operand1, operand2));
                }
                break;
        }
    }

    private static int addition(int number1, int number2) {
        return number1 + number2;
    }

    private static int subtraction(int number1, int number2) {
        return number1 - number2;
    }

    private static int multiplication(int number1, int number2) {
        return number1 * number2;
    }

    private static int division(int dividend, int divisor) {
        return dividend / divisor;
    }

    private static int remainder(int dividend, int divisor) {
        return dividend % divisor;
    }
}