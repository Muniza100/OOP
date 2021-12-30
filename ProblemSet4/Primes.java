import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n == 2) {
            System.out.print("2 ");
        }
        else {
            for (int counter = 2; counter < n; counter++) {
                if (isPrime(counter)) {
                    System.out.printf("%d ", counter);
                }
            }
        }
    }

    // The method that determines whether a number is a prime or not a prime.
    public static boolean isPrime(int num) {
        boolean result = true;
        for (int counter = 2; counter < num; counter++) {
            if (num % counter == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}