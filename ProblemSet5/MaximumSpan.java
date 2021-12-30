import java.util.Arrays;
import java.util.Scanner;

public class MaximumSpan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] integersStringArray = input.nextLine().strip().split(" ");
        int[] integersArray = new int[integersStringArray.length];
        for (int index = 0; index < integersStringArray.length; index++) {
            integersArray[index] = Integer.parseInt(integersStringArray[index]);
        }
        System.out.print(maxSpan(integersArray));
    }

    private static int maxSpan(int[] numbers) {
        int maximumSpan = 1;
        for (int startIndex = 0; startIndex < numbers.length - 1; startIndex++) {
            for (int lastIndex = numbers.length - 1; lastIndex >= 0; lastIndex--) {
                if (numbers[startIndex] == numbers[lastIndex]) {
                    if (startIndex == lastIndex) {
                        break;
                    }
                    if (lastIndex - startIndex + 1> maximumSpan) {
                        maximumSpan = lastIndex - startIndex + 1;
                    }
                    break;
                }
            }
        }
        return maximumSpan;
    }
}