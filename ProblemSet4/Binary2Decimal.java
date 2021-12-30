import java.util.Scanner;

public class Binary2Decimal {
    public static void main(String[] args) {
        int binaryNumber;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        binaryNumber = console.nextInt();

        System.out.printf("Decimal of %d is %d", binaryNumber, binaryToDecimal(binaryNumber));
    }

    private static int binaryToDecimal(int binaryNumber) {
        int decimalNumber = 0;
        while (binaryNumber != 0) {
            int lengthOfNumber = String.valueOf(binaryNumber).length();
            decimalNumber += Math.pow(2, lengthOfNumber - 1);
            binaryNumber -= Math.pow(10, lengthOfNumber - 1);
        }
        return decimalNumber;
    }
}