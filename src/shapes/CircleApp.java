package shapes;

import util.Input;

public class CircleApp {

    static Input input = new Input();

    private static int numCircles;

    public static void printNumCircles() {
        System.out.printf("Number of Circles: %d", numCircles);
    }

    public static void main(String[] args) {
        while(input.yesNo(true)) {
            Circle c = new Circle(input.getDouble(true));
            numCircles++;
            System.out.printf("Area: %f - Circumference: %f\n", c.getArea(), c.getCircumference());
        }
        printNumCircles();
    }
}
