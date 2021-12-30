public class SpacedNumbers {
    public static void main(String[] args) {
        int numberCounter = 1;
        while (numberCounter < 6) {
            int spaceCounter = 0;
            while ((5 - numberCounter) - spaceCounter > 0) {
                System.out.print(" ");
                spaceCounter++;
            }
            System.out.println(numberCounter);
            numberCounter++;
        }
    }
}
