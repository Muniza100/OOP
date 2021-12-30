public class Oops2 {
    public static void main(String[] args) {
        int x = 0;
        System.out.printf("x is %d%n", x);

        x = 15;   // set x to 15.2
        System.out.printf("x is now %d%n" ,x);

        int y;   // set y to 1 more than x
        y = x + 1;
        System.out.printf("x and y are %d and %d%n", x, y);
    }
}