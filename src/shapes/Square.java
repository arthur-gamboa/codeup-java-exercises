package shapes;

public class Square extends Quadrilateral {

//    protected double length;
//    protected double width;

//    public Square(double side) {
//        super(side, side);
//    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }
    @Override
    public double getArea() {
        return Math.pow(length, 2);
    }


    @Override
    void setLength(double length) {
        this.length = length;
        this.width = length;
    }
    @Override
    void setWidth(double width) {
        this.length = this.width = width;
    }

    //    public Square(double side) {
//        super(side, side);
//    }
//
//    @Override
//    public double getArea() {
//        System.out.print("OVERRIDE Square.getArea: ");
//        return Math.pow(this.length, 2);
//    }
//
//    @Override
//    public double getPerimeter() {
//        System.out.print("OVERRIDE Square.getPerimeter :");
//        return 4 * this.width;
//    }

}
