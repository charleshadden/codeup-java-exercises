package shapes;

public class Square extends Quadrilateral{


    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public void setLength(double length) {
        this.length =length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }
}
