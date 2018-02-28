package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Measurable myShape;
        myShape = new Square(5);
        System.out.printf("Square - Area: %f - Perimeter: %f\n", myShape.getArea(), myShape.getPerimeter());
        myShape = new Rectangle(5, 4);
        System.out.printf("Rectangle - Area: %f - Perimeter: %f\n", myShape.getArea(), myShape.getPerimeter());
    }
}
