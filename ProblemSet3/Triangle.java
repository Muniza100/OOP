import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(">>>");
        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();

        boolean zeroValidator = (side1 != 0 && side2 != 0 && side3 != 0);
        if (zeroValidator && (side1 + side2 + side3 == 180)) {
            System.out.print("It is a valid triangle.");
        }
        else {
            System.out.print("It is not a valid triangle.");
        }
    }
}
