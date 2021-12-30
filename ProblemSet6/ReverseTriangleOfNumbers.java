import java.util.Scanner;

public class ReverseTriangleOfNumbers {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        try {
            int n = input.nextInt();
            for (int outerCounter = n; outerCounter > 0; outerCounter--) {
                for (int spaceCounter = n - outerCounter; spaceCounter > 0; spaceCounter--) {
                    System.out.print("  ");
                }
                for (int innerCounter = 1; innerCounter <= outerCounter; innerCounter++) {
                    System.out.print(innerCounter + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Incorrect input");
        }
    }
}
