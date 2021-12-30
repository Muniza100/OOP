public class Circle3 extends Shape {
    protected double radius;

    public Circle3() {
    }

    public Circle3(double radius) {
        this.radius = radius;
    }

    public Circle3(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        return 2* Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "Shape[color=" + color +
                ",filled=" + filled +
                "],radius=" + radius +
                ']';
    }
}
