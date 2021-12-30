import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = input.nextInt();
        double[] numbersArray = new double[n];
        for (int index = 0; index < n; index++) {
            numbersArray[index] = input.nextDouble();
        }
        double largestNumber = -1000000, secondLargestNumber = -999999;
        for (double number: numbersArray) {
            if (number > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = number;
            } else if (number < largestNumber && number > secondLargestNumber) {
                secondLargestNumber = number;
            }
        }
        System.out.print(secondLargestNumber);
    }
}