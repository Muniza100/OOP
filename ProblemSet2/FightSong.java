public class FightSong {
    public static void main(String[] args) {
        printShortChorus();
        printLongChorus();
        printLongChorus();
        printShortChorus();
    }
    public static void printFirstCouplet() {
        System.out.println("Go, team, go!\n" +
                "You can do it.");
    }
    public static void printSecondCouplet() {
        System.out.println("You're the best,\n" +
                "In the West.");
    }
    public static void printShortChorus() {
        printFirstCouplet();
        System.out.println();
    }
    public static void printLongChorus() {
        printFirstCouplet();
        printSecondCouplet();
        printFirstCouplet();
        System.out.println();
    }
}
