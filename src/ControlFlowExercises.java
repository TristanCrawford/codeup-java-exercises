import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What Number Would You Like To Go Up To? ");
        int upTo = in.nextInt();

        System.out.println("\nHere Is Your Table!\n\nnumber | squared | cubed\n------ | ------- | -----");
        for (int i = 1; i <= upTo; i++) {
            System.out.printf("%d\t   | %d\t\t | %d\n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
        }
    }
}
