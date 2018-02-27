import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        do {

            System.out.println();

            System.out.print("Enter A Numerical Grade: ");
            int g = in.nextInt();

            System.out.printf("Letter Grade Is: %c\n", (g > 87) ? 'A' : (g > 80) ? 'B' : (g > 67) ? 'C' : ( g > 60 ) ? 'D' : 'F');

            System.out.println();

            System.out.print("Continue Entering Grades? (Y/N) ");

        } while(in.next().toLowerCase().equals("y"));

        System.out.println("Thanks!");
    }
}
