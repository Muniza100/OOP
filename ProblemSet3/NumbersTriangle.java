public class NumbersTriangle {
    public static void main(String[] args) {
        int lineCounter = 1;
        while (lineCounter < 8) {
            int numberCounter = 1;
            while (numberCounter < lineCounter + 1) {
                System.out.print(lineCounter);
                numberCounter++;
            }
            System.out.println();
            lineCounter++;
        }
    }
}
