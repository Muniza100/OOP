public class Egg2 {
    public static void main(String[] args) {
        printEggTop();
        printEggBottom();
        printEggMiddle();
        printEggTop();
        printEggBottom();
        printEggMiddle();
        printEggBottom();
        printEggFull();
    }
    public static void printEggTop() {
        System.out.println("  _______\n" +
                " /       \\\n" +
                "/         \\");
    }
    public static void printEggMiddle() {
        System.out.println("-\"-'-\"-'-\"-");
    }
    public static void printEggBottom() {
        System.out.println("\\         /\n" +
                " \\_______/");
    }
    public static void printEggFull() {
        printEggTop();
        printEggMiddle();
        printEggBottom();
    }
}
