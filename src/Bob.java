import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Talk to Bob: ");

            String input = in.nextLine();

            if( input.contains("?") ) {
                System.out.println("Sure.\n");
            } else if ( input.contains("!") ) {
                System.out.println("Whoa, Chill Out!\n");
            } else if ( input.isEmpty() ) {
                System.out.println("Fine, Be That Way!\n");
            } else {
                System.out.println("Whatever\n");
            }

        } while(true);
    }
}
