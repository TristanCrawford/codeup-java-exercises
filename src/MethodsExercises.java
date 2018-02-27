import java.util.Scanner;

public class MethodsExercises {

    public static Scanner in = new Scanner(System.in);

    public static float Add(float a, float b) {
        return a + b;
    }

    public static float Subtract(float a, float b) {
        return a - b;
    }

    public static float Multiply(float a, float b) {
        float result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }

    public static float Divide(float a, float b) {
        return a / b;
    }

    public static float Remainder(float a, float b) {
        return a % b;
    }

    public static int getInteger(int min, int max) {
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int userInt = in.nextInt();
        userInt = (userInt >= min && userInt <= max) ? userInt : getInteger(min, max);
        return userInt;
    }

    public static void getFactorial() {
        int userInt = getInteger(1, 20);
        long factorial = 1L;
        for (int i = 1; i <= userInt; i++) {
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);
        System.out.print("Continue? ");
        if("y".equals(in.next().toLowerCase())) getFactorial();
    }

    public static int getRand(int n) {
        return (int)(Math.random() * n + 1);
    }

    public static void rollDie() {
        System.out.print("How Many Sides? ");
        int numSides = in.nextInt();
        System.out.printf("Got %d & %d!\n", getRand(numSides), getRand(numSides));
        System.out.print("Continue? ");
        if("y".equals(in.next().toLowerCase())) rollDie();
    }

    public static void main(String[] args) {

        System.out.println("Add: " + Add(1, 2));
        System.out.println("Subtract: " + Subtract(3, 4));
        System.out.println("Multiply: " + Multiply(5, 6));
        System.out.println("Divide: " + Divide(7, 8));
        System.out.println("Remainder: " + Remainder(9, 10));

        getFactorial();
        rollDie();
    }
}