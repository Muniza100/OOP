import java.util.Scanner;

public class AdjacentArrayElements {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        String[] integersStringArray = input.nextLine().strip().split(" ");
        if (integersStringArray.length != 10) {
            System.out.print("Error");
        } else {
            try {
                int[] integersArray = new int[10];
                for (int counter = 0; counter < 10; counter++) {
                    integersArray[counter] = Integer.parseInt(integersStringArray[counter]);
                }
                int result = 0;
                for (int index = 0; index < 10;) {
                    int numberOfAdjacentElements = 0;
                    int adjacentElement = integersArray[index];
                    while (adjacentElement == integersArray[index]) {
                        numberOfAdjacentElements++;
                        index++;
                        if (index == 10) {
                            break;
                        }
                    }
                    if (numberOfAdjacentElements > 1) {
                        result++;
                    }
                }
                System.out.print(result);
            } catch (Exception e) {
                System.out.print("Error");
            }
        }
    }
}
