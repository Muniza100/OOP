import java.util.Scanner;

public class Decimal2Binary {
    public static void main(String[] args) {
        int decimalNumber;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        decimalNumber = console.nextInt();

        int binaryNumber = decimalToBinary(decimalNumber);
        if (binaryNumber < 10) {
            System.out.printf("Binary of %d is 0000000%d", decimalNumber, binaryNumber);
        }
        else if (binaryNumber < 100) {
            System.out.printf("Binary of %d is 000000%d", decimalNumber, binaryNumber);
        }
        else if (binaryNumber < 1000) {
            System.out.printf("Binary of %d is 00000%d", decimalNumber, binaryNumber);
        }
        else if (binaryNumber < 10000) {
            System.out.printf("Binary of %d is 0000%d", decimalNumber, binaryNumber);
        }
        else if (binaryNumber < 100000) {
            System.out.printf("Binary of %d is 000%d", decimalNumber, binaryNumber);
        }
        else if (binaryNumber < 1000000) {
            System.out.printf("Binary of %d is 00%d", decimalNumber, binaryNumber);
        }
        else if (binaryNumber < 10000000) {
            System.out.printf("Binary of %d is 0%d", decimalNumber, binaryNumber);
        }
        else {
            System.out.printf("Binary of %d is %d", decimalNumber, binaryNumber);
        }
    }

    private static int decimalToBinary(int decimalNumber) {
        int power = 0, binaryNumber = 0, remainder;
        while (decimalNumber != 0) {
            remainder = decimalNumber % 2;
            decimalNumber /= 2;
            if (remainder == 1) {
                binaryNumber += Math.pow(10, power);
            }
            power++;
        }
        return binaryNumber;
    }
}