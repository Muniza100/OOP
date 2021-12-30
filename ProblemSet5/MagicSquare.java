import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        String[] dimensionString = input.nextLine().strip().split(" ");
        int[] dimension = {Integer.parseInt(dimensionString[0]), Integer.parseInt(dimensionString[1])};
        int[][] matrix = new int[dimension[0]][dimension[1]];
        for (int rowCounter = 0; rowCounter < dimension[0]; rowCounter++) {
            String[] rowString = input.nextLine().strip().split(" ");
            for (int columnCounter = 0; columnCounter < dimension[1]; columnCounter++) {
                matrix[rowCounter][columnCounter] = Integer.parseInt(rowString[columnCounter]);
            }
        }
        System.out.println(isMagicSquare(dimension, matrix));
    }

    public static boolean isMagicSquare(int[] dimension, int[][] matrix) {
        if (dimension[0] != dimension[1]) {
            return false;
        }
        else {
            int checkSum = 0;
            for (int rowCounter = 0; rowCounter < dimension[0]; rowCounter++) {
                int sum = 0;
                for (int columnCounter = 0; columnCounter < dimension[1]; columnCounter++) {
                    sum += matrix[rowCounter][columnCounter];
                }
                if (rowCounter == 0) {
                    checkSum = sum;
                }
                else {
                    if (sum != checkSum) {
                        return false;
                    }
                }
            }
            for (int columnCounter = 0; columnCounter < dimension[1]; columnCounter++) {
                int sum = 0;
                for (int rowCounter = 0; rowCounter < dimension[0]; rowCounter++) {
                    sum += matrix[rowCounter][columnCounter];
                }
                if (sum != checkSum) {
                    return false;
                }
            }
            int sum1 = 0, sum2 = 0;
            for (int counter = 0; counter < dimension[0]; counter++) {
                sum1 += matrix[counter][counter];
                sum2 += matrix[dimension[0] - counter - 1][dimension[0] - counter - 1];
            }
            return sum1 == checkSum || sum2 == checkSum;
        }
    }
}
