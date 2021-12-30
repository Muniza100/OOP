import java.util.Scanner;

public class OddsComeFirst {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt(), counter = 0, integerFromInput;
        int[] integers = new int[length], integersWithOddsFirst = new int[length];
        for (int index = 0; index < length; index++) {
            integerFromInput = input.nextInt();
            integers[index] = integerFromInput;
            if (integers[index] % 2 == 1) {
                integersWithOddsFirst[counter] = integers[index];
                counter++;
            }
        }
        for (int index = 0; index < length; index++) {
            if (integers[index] % 2 == 0) {
                integersWithOddsFirst[counter] = integers[index];
                counter++;
            }
        }
        for (int integer: integersWithOddsFirst) {
            System.out.printf("%d ", integer);
        }
    }
}