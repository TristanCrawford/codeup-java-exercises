package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    private static Input input = new Input();

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student tristan = new Student("Tristan");
        tristan.addGrade(100);
        tristan.addGrade(95);
        tristan.addGrade(90);

        Student allie = new Student("Allie");
        allie.addGrade(95);
        allie.addGrade(90);
        allie.addGrade(85);

        Student chris = new Student("Chris");
        chris.addGrade(90);
        chris.addGrade(85);
        chris.addGrade(80);

        Student alex = new Student("Alex");
        alex.addGrade(85);
        alex.addGrade(80);
        alex.addGrade(75);

        students.put("TristanCrawford", tristan);
        students.put("AllieScott", allie);
        students.put("ChrisKelley", chris);
        students.put("AlexBous", alex);

        do {
            System.out.println("Welcome!");
            System.out.println("Here are the GitHub usernames of our students:");
            for (String u : students.keySet())
                System.out.printf("| %s | ", u);
            System.out.print("\nWhat student would you like to see more information about?\n> ");
            String selection = input.getString();
            while (!students.containsKey(selection)) {
                System.out.printf("Sorry, no student was found with the GitHub username of %s\n> ", selection);
                selection = input.getString();
            }
            System.out.printf("Name: %s - GitHub Username: %s\nCurrent Average: %f\n", students.get(selection).getName(), selection, students.get(selection).getGradeAverage());
            System.out.print("Would you like to see another student? ");
        } while(input.yesNo(true));

        System.out.println("Goodbye, and have a wonderful day!");
    }
}
