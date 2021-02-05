package grades;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student {
    public static void main(String[] args) {

        Student tim = new Student("Timothy");
        tim.addGrade(90);
        tim.addGrade(80);
        System.out.println(tim.getName());
        System.out.println("Tim's grades: " + tim.grades);
        System.out.println(tim.getGradeAverage());

    }

//TODO: Create a class named Student. It should have private properties for the student's name, and grades. The grades property should be an ArrayList of integers.
    private String name;
    private ArrayList<Integer> grades;


//TODO: The student class should have a constructor that sets name property, and initializes the grades property as an empty ArrayList.
    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

//TODO: The Student class should have the following methods:
// returns the student's name
    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return total / grades.size();
    }
}
