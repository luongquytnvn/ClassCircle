public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + getRadius() + ", color = " + getColor() + ", area = " + getArea();
    }
}
