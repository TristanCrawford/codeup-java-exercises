import java.util.Scanner;

public class ConsoleExercises {

    public static Scanner in = new Scanner(System.in);

    public static float[] getClassMeasurements(float length, float width, float height) {
        return new float[] { length * width, (length * 2) + (width * 2), length * width * height };
    }

    public static void main(String[] args) {
//
//        System.out.print("Enter A Number: ");
//        int userNum = in.nextInt();
//
//        String[] words = new String[3];
//
//        for (int i = 0; i < 3; i++) {
//            System.out.print("Enter A Word: ");
//            words[i] = in.next();
//        }
//
//        System.out.print("Enter A Sentence: ");
//        String sentence = in.nextLine();
//        System.out.println(sentence);

        System.out.print("Enter a Length Value (m): ");
        float l = in.nextFloat();
        System.out.print("Enter a Width Value (m): ");
        float w = in.nextFloat();
        System.out.print("Enter a Height Value (m): ");
        float h = in.nextFloat();

        float[] m = getClassMeasurements(l, w, h);
        System.out.printf("Area: %.2f m² - Perimiter: %.2f m - Volume: %.2f m³\n", m[0], m[1], m[2]);
    }
}
