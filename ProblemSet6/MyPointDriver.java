public class MyPointDriver {
    public static void main(String[] args) {
        MyPoint[] points = new MyPoint[10];
        for (int counter = 0; counter < points.length; counter++) {
            points[counter] = new MyPoint(counter + 1, counter + 1);
        }
        for (MyPoint point: points) {
            System.out.println(point);
        }
    }
}
