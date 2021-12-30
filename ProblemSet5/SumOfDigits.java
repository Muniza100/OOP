import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        try {
            long integer = Math.abs(input.nextLong());
            int sumOfDigitsInInteger = digitSum(integer);
            System.out.print(sumOfDigitsInInteger);
        } catch (Exception e) {
            System.out.print("error");
        }
    }

    public static int digitSum(long integer) {
        String integerString = String.valueOf(integer);
        int sumOfDigits = 0;
        for (int index = 0; index < integerString.length(); index++) {
            sumOfDigits += integerString.charAt(index) - 48;
        }
        return sumOfDigits;
    }
}
