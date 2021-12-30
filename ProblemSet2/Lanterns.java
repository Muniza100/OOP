public class Lanterns {
    public static void main(String[] args) {
        printPyramid();
        System.out.println();
        printPyramid();
        printBlock();
        printLongLine();
        printPyramid();
        System.out.println();
        printPyramid();
        printShortLine();
        printBlock();
        printBlock();
        printShortLine();
        printShortLine();
    }
    public static void printPyramid() {
        System.out.println("    *****\n" +
                "  *********\n" +
                "*************");
    }
    public static void printBlock() {
        System.out.println("* | | | | | *");
    }
    public static void printLongLine() {
        System.out.println("*************");
    }
    public static void printShortLine() {
        System.out.println("    *****");
    }
}
