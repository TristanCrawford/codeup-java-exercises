package util;

import java.util.Scanner;

public class Input {

    private Scanner input;

    public String getString() {
        return this.input.nextLine();
    }

    public String getString(boolean prompt) {
        System.out.print("Enter A String: ");
        return getString();
    }

    public boolean yesNo() {
        String s = this.input.next().toLowerCase();
        return "y".equals( s ) || s.contains("yes");
    }

    public boolean yesNo(boolean prompt) {
        System.out.print("(Yes/No): ");
        return yesNo();
    }

    public int getInt() {
        return this.input.nextInt();
    }

    public int getInt(boolean prompt) {
        System.out.print("Enter An Integer: ");
        return getInt();
    }

    public int getInt(int min, int max) {
        int n = getInt();
        return ( n >= min && n <= max ) ? n : getInt(min, max);
    }

    public int getInt(int min, int max, boolean prompt) {
        System.out.printf("Enter an Integer between %d and %d: ", min, max);
        return getInt(min, max);
    }

    public double getDouble() {
        return this.input.nextDouble();
    }

    public double getDouble(boolean prompt) {
        System.out.print("Enter A Double: ");
        return getDouble();
    }

    public double getDouble(double min, double max) {
        double n = getDouble();
        return ( n >= min && n <= max ) ? n : getDouble(min, max);
    }

    public double getDouble(double min, double max, boolean prompt) {
        System.out.printf("Enter a Double between %f and %f: ", min, max);
        return getDouble();
    }

    public Input() {
        this.input = new Scanner(System.in);
    }
}
