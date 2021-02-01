package shapes;

public class Circle {
    private double radius;

//TODO: This class should have a private radius property that is set through the constructor, and various methods for getting information about the circle, detailed below.
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

}
