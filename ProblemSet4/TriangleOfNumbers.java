import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        System.out.println();
        printTriangle(n);
    }

    private static void printTriangle(int n) {
        for (int counter = 1; counter <= n; counter++) {
            for (int spaceCounter = 0; spaceCounter < n - counter; spaceCounter++) {
                System.out.print(" ");
            }
            for (int numberCounter = 1; numberCounter <= counter; numberCounter++) {
                System.out.print(numberCounter);
            }
            System.out.println();
        }
    }
}