import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int n = Math.abs(input.nextInt());
            String nn = String.valueOf(n) + n;
            String nnn = String.valueOf(n) + n + n;
            System.out.printf("%d + %d%d + %d%d%d = %d", n, n, n, n, n, n, n + Integer.parseInt(nn) + Integer.parseInt(nnn));
        } catch (Exception e) {
            System.out.print("error");
        }

    }
}