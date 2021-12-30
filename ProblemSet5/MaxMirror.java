import java.util.Scanner;
import java.util.ArrayList;

public class MaxMirror {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine().replaceAll(" ", "");
        System.out.print(maxMirror(inputString));
    }

    public static int maxMirror(String integersString) {
        int largestMirrorLength = 0;
        for (int counter = 0; counter < integersString.length(); counter++) {
            char integer = integersString.charAt(counter);
            ArrayList<Integer> integerIndices = new ArrayList<>();
            int integerIndex = integersString.indexOf(integer);
            if (integerIndex != integersString.length() - 1) {
                for (int index = integerIndex + 1; index < integersString.length(); index++) {
                    if (integersString.charAt(index) == integer) {
                        integerIndices.add(index);
                    }
                }
            }
            for (int sequenceStart: integerIndices) {
                int mirrorLength = 0;
                integerIndex = integersString.indexOf(integer);
                while (integersString.charAt(integerIndex) == integersString.charAt(sequenceStart) &&
                        integerIndex < sequenceStart) {
                    mirrorLength++;
                    integerIndex++;
                    sequenceStart--;
                }
                if (mirrorLength > largestMirrorLength) {
                    largestMirrorLength = mirrorLength;
                }
            }
        }
        return largestMirrorLength;
    }
}
