import java.util.Scanner;

public class SecondSmallest {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = input.nextInt();
        double[] numbersArray = new double[n];
        for (int index = 0; index < n; index++) {
            numbersArray[index] = input.nextDouble();
        }
        double smallestNumber = numbersArray[0], secondSmallestNumber = numbersArray[0];
        for (double number: numbersArray) {
            if (number < smallestNumber) {
                secondSmallestNumber = smallestNumber;
                smallestNumber = number;
            } else if (number > smallestNumber && number < secondSmallestNumber) {
                secondSmallestNumber = number;
            }
        }
        System.out.print(secondSmallestNumber);
    }
}
