package grades;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {

        HashMap<Student, Student> students = new HashMap<>();

//TODO: Create at least 4 Student objects with at least 3 grades each, and add them to the map.
        Student albert = new Student("Albert");
        albert.addGrade(90);
        albert.addGrade(89);
        albert.addGrade(80);
        Student bernard = new Student("Bernard");
        bernard.addGrade(70);
        bernard.addGrade(78);
        bernard.addGrade(71);
        Student charlie = new Student("Charlie");
        charlie.addGrade(81);
        charlie.addGrade(84);
        charlie.addGrade(88);
        Student denise = new Student("Denise");
        denise.addGrade(67);
        denise.addGrade(72);
        denise.addGrade(70);

        students.put(albert, albert);
//        students.put(bernard);
//        students.put(3, charlie);
//        students.put(4, charlie);
        System.out.println(students);

    }
}
