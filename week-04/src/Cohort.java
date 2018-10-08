import sun.invoke.empty.Empty;

import java.util.ArrayList;
import java.util.Objects;

public class Cohort {

    String name;
    ArrayList studentsList;
    ArrayList mentorsList;

    public Cohort(String name) {
        this.name = name;
        studentsList = new ArrayList<>();
        mentorsList = new ArrayList<>();

    }

    public void addStudent(Student student) {
        studentsList.add(student);

    }

    public void addMentor(Mentor mentor) {
        mentorsList.add(mentor);
    }
    public String getInformation() {
        return "The " + name + " cohort has " + studentsList.size() + " students " + mentorsList.size() + " mentors.";
    }
    public void info(){
        System.out.println(getInformation());
    } //prints out "The name cohort has students.size() students and mentors.size() mentors.
}
