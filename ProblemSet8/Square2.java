public class Square2 extends Rectangle2 {
    double side;
    public Square2() {

    }
    public Square2(double side) {
        this.side= side;
    }

    public Square2( double side, String color, boolean filled) {
        setColor(color);
        setFilled(filled);
        this.side =side;
    }
    @Override
    public double getArea(){
        return side*side;
    }

    @Override
    public double getPerimeter() {
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() +
                ",side=" + side +
                ']';
    }
}
