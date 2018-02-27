public class ControlFlowExercises {
    public static void main(String[] args) {

        // while

        int a = 5;

        while (a <= 15) {
            System.out.printf("%d ", a);
            a++;
        }

        System.out.println();

        // do-while

        int b = 2;

        do {
            System.out.println(b);
            b = (int) Math.pow(b, 2);
        } while ( b <= 1000000 );

        // for

        for (int i = 5; i <= 15; i++) {
            System.out.printf("%d ", i);
        }

        System.out.println();

        for (int i = 2; i <= 1000000; i = (int) Math.pow(i, 2) ) {
            System.out.println(i);
        }
    }
}
