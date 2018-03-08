package grades;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }
    
    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        double sum = 0;
        for( int grade : this.grades )
            sum += grade;
        return sum / this.grades.size();
    }

    public static void main(String[] args) {
        Student me = new Student("Tristan", new ArrayList<>(Arrays.asList(5, 10, 15)));
        System.out.println(me.getGradeAverage());
    }
}
