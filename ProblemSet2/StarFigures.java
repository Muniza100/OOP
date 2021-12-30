public class StarFigures {
    public static void main(String[] args) {
        print2HorizontalLines();
        printX();
        System.out.println();
        print2HorizontalLines();
        printX();
        print2HorizontalLines();
        System.out.println();
        printVerticalLine();
        print2HorizontalLines();
        printX();
    }
    public static void print2HorizontalLines() {
        System.out.println("*****");
    }
    public static void printX() {
        System.out.println(" * *\n" +
                "  *\n" +
                " * *");
    }
    public static void printVerticalLine() {
        System.out.println("  *\n" +
                "  *\n" +
                "  *");
    }
}
