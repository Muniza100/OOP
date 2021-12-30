import java.util.Scanner;

public class ShowTwos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.print(showTwos(number));
    }

    public static String showTwos(int number){
        int twos = 0, numberCopy = number;
        while (number % 2 == 0) {
            twos++;
            number /= 2;
        }
        StringBuilder twosString = new StringBuilder();
        while (twos > 0) {
            twosString.append("2 * ");
            twos--;
        }
        return String.format("%d = %s * %d", numberCopy, twosString, number);
    }
}