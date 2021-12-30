public class SpacesNumbers {
    public static void main(String[] args) {
        int lineCounter = 1;
        while (lineCounter < 6) {
            int spaceCounter = 5 - lineCounter;
            int numberCounter = lineCounter;
            while (spaceCounter != 0) {
                System.out.print(" ");
                spaceCounter--;
            }
            while (numberCounter != 0) {
                System.out.print(lineCounter);
                numberCounter--;
            }
            System.out.println();
            lineCounter++;
        }
    }
}
