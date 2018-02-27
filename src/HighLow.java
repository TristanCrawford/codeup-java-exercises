import java.util.Scanner;

public class HighLow {

    public static Scanner in = new Scanner(System.in);
    public static final int randNum = (int)(Math.random() * 99 + 1);

    public static int numGuesses = 0;

    public static int getInteger(int min, int max) {
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int userInt = in.nextInt();
        userInt = (userInt >= min && userInt <= max) ? userInt : getInteger(min, max);
        return userInt;
    }

    public static void makeGuess() {

        if(numGuesses > 4) {
            System.out.println("Too Many Guesses!");
            return;
        }

        System.out.print("Guess A Number Between 1 and 100: ");
        int guess = getInteger(1, 100);
        numGuesses++;

        if(guess == randNum) {
            System.out.println("GOOD GUESS");
            return;
        } else if(guess < randNum) {
            System.out.println("HIGHER");
        } else {
            System.out.println("LOWER");
        }

        makeGuess();
    }

    public static void main(String[] args) {
        makeGuess();
    }
}
