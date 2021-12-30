import java.util.Scanner;

public class ZeroFront {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] inputArray = input.nextLine().strip().split(" ");
        int[] outputArray = new int[inputArray.length];
        int lastIndex = outputArray.length - 1, counterForOutputArray = 0;
        try {
            for (int counter = inputArray.length - 1; counter >= 0; counter--) {
                if (!inputArray[counter].equals("0")) {
                    outputArray[lastIndex - counterForOutputArray] = Integer.parseInt(inputArray[counter]);
                    counterForOutputArray++;
                }
            }
            for (int integer : outputArray) {
                System.out.printf("%d ", integer);
            }
        } catch (Exception e) {
            System.out.print("Input error");
        }
    }
}