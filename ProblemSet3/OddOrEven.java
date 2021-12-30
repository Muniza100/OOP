import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(">>>");
        int number = input.nextInt();

        if (number == 0) {
            System.out.print("0 is not odd nor even");
        }
        else if (number % 2 == 0) {
            System.out.print("This number is even");
        }
        else {
            System.out.print("This number is odd");
        }
    }
}
