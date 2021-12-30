public class WaveNumbers40 {
    public static void main(String[] args) {
        int lineCounter = 1;
        while (lineCounter < 5) {
            int characterCounter = 0;


            if ((lineCounter == 1) || (lineCounter == 4)) {
                while (characterCounter < 40) {
                    System.out.print("-");
                    characterCounter++;
                }
            }


            else if (lineCounter == 2) {
                while (characterCounter < 40) {
                    switch (characterCounter % 4) {
                        case 0:
                            System.out.print("_");
                            break;
                        case 1:
                            System.out.print("-");
                            break;
                        case 2:
                            System.out.print("^");
                            break;
                        case 3:
                            System.out.print("-");
                            break;
                    }
                    characterCounter++;
                }
            }


            else if (lineCounter == 3) {
                int numberCounter = 1;
                while (characterCounter < 40) {
                    System.out.print(numberCounter);
                    System.out.print(numberCounter);
                    numberCounter++;
                    if (numberCounter == 10) {
                        numberCounter = 0;
                    }
                    characterCounter += 2;
                }
            }
            System.out.println();
            lineCounter++;
        }
    }
}
