package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape;

//        myShape = new Square(5);
        myShape = new Rectangle(5, 4);
//        myShape.setLength();   // won't work
        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());

//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());
    }
}
