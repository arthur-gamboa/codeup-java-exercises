package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

//    public Quadrilateral(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }

    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

    // this means if we extend this class, we have to write this method for
    // that class that is extending..
    abstract void setLength(double length);

    abstract void setWidth(double width);

    @Override
    public double getPerimeter() {
        return (2 * this.width) + (2 * this.length);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }
}
