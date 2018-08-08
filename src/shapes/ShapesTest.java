package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape;



        myShape = new Rectangle();
        ((Rectangle) myShape).setLength(6);
        ((Rectangle) myShape).setWidth(8);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        myShape = new Square();
        ((Square) myShape).setWidth(4);
        ((Square) myShape).setLength(5);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
    }
}
