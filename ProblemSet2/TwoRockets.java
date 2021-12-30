public class TwoRockets {
    public static void main(String[] args) {
        printTwoTriangles();
        System.out.print("\n");
        printTwoSquares();
        System.out.println("|  KG  | |  KG  |\n" +
                "|Soonun| |Soonun|");
        printTwoSquares();
        printTwoTriangles();
    }
    public static void printTwoTriangles() {
        System.out.print("   /\\       /\\\n" +
                "  /  \\     /  \\\n" +
                " /    \\   /    \\");
    }
    public static void printTwoSquares() {
        System.out.println("+------+ +------+\n" +
                "|      | |      |\n" +
                "|      | |      |\n" +
                "+------+ +------+");
    }
}
