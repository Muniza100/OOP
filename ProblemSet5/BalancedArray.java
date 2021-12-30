import java.util.Scanner;

public class BalancedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
            try {
                for (int counter = 0; counter < 10; counter++) {
                    numbers[counter] = input.nextInt();
                }
            int leftSum = 0, rightSum = 1, numberCounter = 0;
            boolean isBalanced = false;
            while (leftSum < rightSum) {
                leftSum = 0;
                rightSum = 0;
                for (int numberCounterCopy = numberCounter; numberCounterCopy >= 0; numberCounterCopy--) {
                    leftSum += numbers[numberCounterCopy];
                }
                for (int numberCounterCopy = numberCounter + 1; numberCounterCopy < numbers.length; numberCounterCopy++) {
                    rightSum += numbers[numberCounterCopy];
                }
                if (leftSum == rightSum) {
                    isBalanced = true;
                    break;
                }
                numberCounter++;
            }
            if (isBalanced) {
                System.out.print("Can be balanced");
            }
            else {
                System.out.print("Can not be balanced");
            }
        } catch (Exception e) {
                System.out.println("Error");
        }
    }
}
