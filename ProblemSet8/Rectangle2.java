public class Rectangle2 extends Shape{
    protected double width;
    protected double length;

    public Rectangle2() {
    }

    public Rectangle2(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle2( double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea(){
        return 2*width*2*length;
    }

    @Override
    public double getPerimeter() {
        return 2*width+2*length;
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "Shape[color=" + color+
                ",width=" + width +
                "],length=" + length +
                ']';
    }
}
