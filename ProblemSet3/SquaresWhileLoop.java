public class SquaresWhileLoop {
    public static void main(String[] args) {
        int numberCounter = 0;
        int adder = 3;
        int squared = 1;

        while (numberCounter < 10) {
            System.out.print(squared + " ");
            numberCounter++;
            squared += adder;
            adder += 2;
        }
    }
}
