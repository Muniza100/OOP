public class NestedNumbers {
    public static void main(String[] args) {
        int lineCounter = 1;
        while (lineCounter < 4) {
            int numberCounter = 1;
            while (numberCounter < 10) {
                System.out.print(numberCounter);
                System.out.print(numberCounter);
                System.out.print(numberCounter);
                numberCounter++;
            }
            System.out.println();
            lineCounter++;
        }
    }
}
