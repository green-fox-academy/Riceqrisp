public class Student{

    String previousOrganization;
    int skippedDays;
    String name;
    int age;
    String gender;


    public Student(){
        name = "Jane Doe";
        age = 30;
        gender = "female";
        previousOrganization = "School of life";
        skippedDays = 0;
    }

    public Student(String name, int age, String gender,String previousOrganization){
        //super(name,age,gender);
        this.previousOrganization = previousOrganization;
        skippedDays = 0;
    }

    public String goal() {
        return "Be a junior software developer";

    }
    public String introduce(String introduction){
        return generateIntroduction() + " from " + previousOrganization + " who skipped " + skippedDays + "days from the course already.";
    }
    public int skippedDays(int numberOfDays){
        skippedDays = skippedDays + numberOfDays;
        return skippedDays;
    }

}