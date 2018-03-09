package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import util.Input;

public class ContactManager {

    private List<Contact> contacts;

    public ContactManager() {
        this.contacts = readContacts();
    }

    public List<Contact> readContacts() {
        List<Contact> contacts = new ArrayList<>();
        
        try {
            for( String line : Files.readAllLines(Paths.get("data","contacts.txt")) ) {
                String[] info = line.split(" ");
                contacts.add(new Contact(info[0], info[1]));
            }
        } catch (IOException e) { System.out.println("Oh noes."); }

        return contacts;
    }

    public void writeContacts() {
        try {
            List<String> info = new ArrayList<>();
            for (Contact c : this.contacts) {
                info.add( c.getName() + " " + c.getNumber() );
            }
            Files.write(Paths.get("data","contacts-new.txt"), info, StandardOpenOption.CREATE);
        } catch (IOException e) { System.out.println("Oh noes."); }
    }

    public void listContacts() {
        System.out.println("Name      | Phone Number\n--------------------------");
        for (Contact c : this.contacts) {
            System.out.printf("%-9s | %-14s\n", c.getName(), c.getNumber());
        }
        System.out.println("--------------------------");
    }

    public void addContact(String name, String number) {
        System.out.println("--------------------------");
        this.contacts.add(new Contact(name, number));
        System.out.println(name + " added!");
        System.out.println("--------------------------");
    }

    public void deleteContact(String name) {
        System.out.println("--------------------------");
        Predicate<Contact> pr = p -> name.equals(p.getName());
        this.contacts.removeIf(pr);
        System.out.println(name + " deleted!");
        System.out.println("--------------------------");
    }

    public void searchContact(String name) {
        System.out.println("--------------------------");
        for (Contact c : this.contacts) {
            if (name.equalsIgnoreCase(c.getName())) {
                System.out.printf("%-9s | %-14s\n", c.getName(), c.getNumber());
                break;
            }
        } 
        System.out.println("--------------------------");
    }

    public void userSelect() {

        Input in = new Input();

        do {

            System.out.println("--------------------------");
            System.out.println("1. View contacts.");
            System.out.println("2. Add a new contact.");
            System.out.println("3. Search a contact by name.");
            System.out.println("4. Delete an exising contact.");
            System.out.println("5. Exit.");
            System.out.println("--------------------------");

            int c = in.getInt(1, 5, "Choose an option: ");
            
            System.out.println("--------------------------");

            String name, number;

            switch (c) {
                case 1:
                listContacts();
                break;
                case 2:
                name = in.getString("Enter a contact name: ");
                number = in.getString("Enter a phone number: ");
                this.addContact(name, number);
                break;
                case 3:
                name = in.getString("Enter a contact name: ");
                this.searchContact(name);
                break;
                case 4:
                name = in.getString("Enter a contact name: ");
                this.deleteContact(name);
                break;
                case 5:
                System.out.println("Goodbye!");
                return;
            }
        } while ( in.yesNo("Continue operations? ") );
    }

    public static void main(String[] args) {
        ContactManager manager = new ContactManager();
        manager.userSelect();
        manager.writeContacts();
    }
}
