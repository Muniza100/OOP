import java.util.Scanner;

public class SumEvenFibonacciNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int number1 = 1, number2 = 1, temporary, result = 0;
        while (number2 <= n) {
            if (number2 % 2 == 0) {
                result += number2;
            }
            temporary = number2;
            number2 += number1;
            number1 = temporary;
        }
        System.out.print(result);
    }
}
