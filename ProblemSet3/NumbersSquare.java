public class NumbersSquare {
    public static void main(String[] args) {
        int lineCounter = 1;
        while (lineCounter < 5) {
            int numberCounter = 1;
            while (numberCounter < 6) {
                System.out.print(numberCounter);
                numberCounter++;
            }
            System.out.println();
            lineCounter++;
        }
    }
}
