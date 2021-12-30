public class MyPointTest {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(4, 5);
        System.out.println("x-coordinate of point1 is " + point1.getX());
        System.out.println("y-coordinate of point1 is " + point1.getY());
        System.out.println("Point1 is " + point1);
        point1.setX(5);
        point1.setY(4);
        System.out.println("x-coordinate of point1 is " + point1.getX());
        System.out.println("y-coordinate of point1 is " + point1.getY());
        System.out.println("Point1 is " + point1);
        point1.setXY(1, 2);
        System.out.println("x-coordinate of point1 is " + point1.getX());
        System.out.println("y-coordinate of point1 is " + point1.getY());
        System.out.println("Point1 is " + point1);

        MyPoint point2 = new MyPoint(7, 8);
        System.out.println("Point2 is " + point2);
        System.out.println("Distance between point1 and point2 is " + point1.distance(point2));
        System.out.println("Distance between point1 and (20, 21) is " + point1.distance(20, 21));
        System.out.println("Distance between point1 and origin is " + point1.distance());

        final MyPoint origin = new MyPoint();
        System.out.println("Origin's coordinates is " + origin);
    }
}
