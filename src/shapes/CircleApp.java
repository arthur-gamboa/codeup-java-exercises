//TODO: Inside of shapes, create a class named CircleApp that prompts the user for the radius of the circle using your Input class, creates a Circle object, and displays the circumference and area. (Note that you will need to import your Input class.)

package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        double radius = input.getDouble();
        Circle circle = new Circle(radius);
        System.out.println("circle.getArea() = " + circle.getArea());
        System.out.println("circle.getCircumference() = " + circle.getCircumference());
    }
}
