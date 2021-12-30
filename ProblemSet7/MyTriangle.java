public class MyTriangle {
    private final MyPoint v1;
    private final MyPoint v2;
    private final MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle[" +
                "v1=" + v1.toString() +
                ",v2=" + v2.toString() +
                ",v3=" + v3.toString() +
                ']';
    }

    public double getPerimeter() {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    public String getType() {
        if (v1.distance(v2) == v2.distance(v3) & v2.distance(v3) == v3.distance(v1)) {
            return "equilateral";
        }
        else if (v1.distance(v2) == v2.distance(v3)
                | v2.distance(v3) == v3.distance(v1)
                | v3.distance(v1) == v1.distance(v2)) {
            return "isosceles";
        }
        else {
            return "scalene";
        }
    }
}
