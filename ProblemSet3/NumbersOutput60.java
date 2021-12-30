public class NumbersOutput60 {
    public static void main(String[] args) {
        int lineCounter = 0;
        while (lineCounter < 2) {
            int characterCounter = 0;
            switch (lineCounter) {
                case 0:
                    while (characterCounter < 60) {
                        if (characterCounter % 10 == 9) {
                            System.out.print("|");
                        }
                        else {
                            System.out.print(" ");
                        }
                        characterCounter++;
                    }
                    break;
                case 1:
                    int numberCounter = 1;
                    while (characterCounter < 60) {
                        System.out.print(numberCounter);
                        numberCounter++;
                        if (numberCounter == 10) {
                            numberCounter = 0;
                        }
                        characterCounter++;
                    }
                    break;
            }
            System.out.println();
            lineCounter++;
        }
    }
}
