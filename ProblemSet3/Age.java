import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(">>>");
        int age = input.nextInt();
        if (age >= 18 && age <= 150) {
            System.out.print("Old enough!");
        }
        else if (age > 0 && age < 18) {
            System.out.print("Too young.");
        }
        else {
            System.out.print("Incorrect age.");
        }
    }
}
