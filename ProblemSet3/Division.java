import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(">>> Enter a dividend: ");
        int dividend = input.nextInt();
        System.out.print("    Enter a divisor: ");
        int divisor = input.nextInt();

        if (divisor != 0) {
            System.out.print("    Quotient is : " + dividend/divisor);
        }
        else {
            System.out.print("    Incorrect input!");
        }
    }
}
