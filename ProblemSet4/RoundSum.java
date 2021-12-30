import java.util.Scanner;

public class RoundSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        System.out.printf("Rounded sum is %d", roundSum(number1, number2, number3));
    }

    private static int roundSum(int number1, int number2, int number3) {
        int sum = number1 + number2 + number3;
        int lastDigit = sum - ((sum / 10) * 10);
        if (lastDigit >= 5) {
            return (sum / 10) * 10 + 10;
        }
        else {
            return (sum / 10) * 10;
        }
    }
}