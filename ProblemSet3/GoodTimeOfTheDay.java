import java.util.Scanner;

public class GoodTimeOfTheDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(">>>");
        int time = input.nextInt();
        if (time >= 0 && time <= 5) {
            System.out.print("Good night!");
        }
        else if (time > 5 && time < 10) {
            System.out.print("Good morning!");
        }
        else if (time >= 10 && time < 20) {
            System.out.print("Good day!");
        }
        else if (time >= 20 && time <= 24) {
            System.out.print("Good evening!");
        }
        else {
            System.out.print("Not acceptable time.");
        }
    }
}
