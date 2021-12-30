import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n = input.nextInt();
        if (n >= 0) {
            System.out.println("\nX\tX!");

            for (int counter = 0; counter <= n; counter++) {
                System.out.printf("%d\t%d%n", counter, factorialOfN(counter));
            }
        }
        else {
            System.out.print("Incorrect input!");
        }
    }

    private static long factorialOfN(int n) {
        long result = 1;
        if (n == 0) {
            return result;
        }
        else {
            int counter = 1;
            while (counter <= n) {
                result *= counter;
                counter++;
            }
            return result;
        }
    }
}