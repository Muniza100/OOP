import java.util.Scanner;

public class Gpa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(">>> ");
        float grade = input.nextFloat();
        if (grade <= 100 && grade >= 93) {
            System.out.print("A 4.0");
        }
        else if (grade <= 92 && grade >= 90) {
            System.out.print("A- 3.67");
        }
        else if (grade <= 89 && grade >= 87) {
            System.out.print("B+ 3.33");
        }
        else if (grade <= 86 && grade >= 83) {
            System.out.print("B 3.0");
        }
        else if (grade <= 82 && grade >= 80) {
            System.out.print("B- 2.67");
        }
        else if (grade <= 79 && grade >= 77) {
            System.out.print("C+ 2.33");
        }
        else if (grade <= 76 && grade >= 70) {
            System.out.print("C 2.0");
        }
        else if (grade <= 69 && grade >= 60) {
            System.out.print("D 1.0");
        }
        else if (grade <= 59 && grade >= 0) {
            System.out.print("F 0.0");
        }
        else {
            System.out.print("Incorrect grade!");
        }
    }
}
