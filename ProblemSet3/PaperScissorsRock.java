import java.util.Scanner;

public class PaperScissorsRock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Player1: ");
        String move1 = input.next();
        System.out.print("Player2: ");
        String move2 = input.next();
        boolean player1VictoryValidator = ((move1 + move2).equals("scpp") ||
                (move1 + move2).equals("pprc") || (move1 + move2).equals("rcsc"));
        boolean player2VictoryValidator = ((move2 + move1).equals("scpp") ||
                (move2 + move1).equals("pprc") || (move2 + move1).equals("rcsc"));
        if (player1VictoryValidator) {
            System.out.print("Winner is Player1");
        }
        else if (player2VictoryValidator) {
            System.out.print("Winner is Player2");
        }
        else {
            System.out.print("Draw");
        }
    }
}
