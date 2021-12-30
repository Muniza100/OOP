import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (isPalindrome(number)) {
            System.out.print("\nThis number is a palindrome");
        }
        else {
            System.out.print("\nThis number is not a palindrome");
        }
    }

    private static boolean isPalindrome(int number) {
        if (number < 10) {
            return true;
        }
        else if (number < 100) {
            return number % 11 == 0;
        }
        else if (number < 1000) {
            int ones = number - ((number / 10) * 10);
            int hundreds = number / 100;
            return ones == hundreds;
        }
        else if (number < 10000) {
            int ones = number - ((number / 10) * 10);
            int tens = number / 10 - ((number / 100) * 10);
            int hundreds = number / 100 - ((number / 1000) * 10);
            int thousands = number / 1000;
            return ones == thousands && tens == hundreds;
        }
        else if (number < 100000){
            int ones = number - ((number / 10) * 10);
            int tens = number / 10 - ((number / 100) * 10);
            int thousands = number / 1000 - ((number / 10000) * 10);
            int tenThousands = number / 10000;
            return ones == tenThousands && tens == thousands;
        }
        else {
            int ones = number - ((number / 10) * 10);
            int tens = number / 10 - ((number / 100) * 10);
            int hundreds = number / 100 - ((number / 1000) * 10);
            int thousands = number / 1000 - ((number / 10000) * 10);
            int tenThousands = number / 10000 - ((number / 100000) * 10);
            int hundredThousands = number / 100000;
            return ones == hundredThousands && tens == tenThousands && hundreds == thousands;
        }
    }
}