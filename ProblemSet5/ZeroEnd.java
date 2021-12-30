import java.util.Scanner;

public class ZeroEnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] inputArray = input.nextLine().strip().split(" ");
        int[] outputArray = new int[inputArray.length];
        try {
            int outputArrayCounter = 0;
            for (String integer: inputArray) {
                if (!integer.equals("0")) {
                    outputArray[outputArrayCounter] = Integer.parseInt(integer);
                    outputArrayCounter++;
                }
            }
            for (int integer: outputArray) {
                System.out.printf("%d ", integer);
            }
        } catch (Exception e) {
            System.out.print("Input error");
        }
    }
}
