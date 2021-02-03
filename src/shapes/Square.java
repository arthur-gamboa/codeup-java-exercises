package shapes;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getArea() {
        System.out.print("OVERRIDE Square.getArea: ");
        return Math.pow(this.length, 2);
    }

    @Override
    public double getPerimeter() {
        System.out.print("OVERRIDE Square.getPerimeter :");
        return 4 * this.width;
    }

}
