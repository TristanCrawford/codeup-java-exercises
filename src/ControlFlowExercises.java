public class ControlFlowExercises {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            System.out.println(((i % 5) == 0 && (i % 3) == 0) ? "FizzBuzz" : ((i % 3) == 0) ? "Fizz" : ((i % 5) == 0) ? "Buzz" : Integer.toString(i));
        }
    }
}
