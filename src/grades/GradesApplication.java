package grades;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {

        HashMap<String, String> students = new HashMap<>();

//TODO: Create at least 4 Student objects with at least 3 grades each, and add them to the map.
        Student albert = new Student("Albert");
        students.put("albert", "albert123");
        albert.addGrade(90);
        albert.addGrade(89);
        albert.addGrade(80);
        Student bernard = new Student("Bernard");
        students.put("bernard", "bernard123");
        bernard.addGrade(70);
        bernard.addGrade(78);
        bernard.addGrade(71);
        Student charlie = new Student("Charlie");
        students.put("charlie", "charlie123");
        charlie.addGrade(81);
        charlie.addGrade(84);
        charlie.addGrade(88);
        Student denise = new Student("Denise");
        students.put("denise", "denise123");
        denise.addGrade(67);
        denise.addGrade(72);
        denise.addGrade(70);

        System.out.println(students.keySet());
        System.out.println(students.values());

    }
}
