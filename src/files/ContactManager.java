package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ContactManager {

    private static Path contactsPath = Paths.get("data","contacts.txt");
    private static List<String> contactList;

    public static void main(String[] args) {
        try {
            contactList = Files.readAllLines(contactsPath);
            System.out.println("Name      | Phone Number\n--------------------------");
            for( String contact : contactList ) {
                String[] c = contact.split(" ");
                System.out.printf("%-9s | %-14s\n", c[0], c[1]);
            }
        } catch (IOException e) {
            System.out.println("Oh noes.");
        }
    }
}
