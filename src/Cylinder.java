public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume() {
        return this.getArea()*height;
    }

    @Override
    public String toString() {
        return "A Circle with volume = " + getVolume() + ", which is a subclass of " + super.toString();
    }
}
