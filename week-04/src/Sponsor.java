public class Sponsor extends Person {
    String company;
    int hiredStudents;


    public Sponsor(String name,int age, String gender,String company,int hiredStudents) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = hiredStudents;

    }
    public Sponsor (){
        name = "Jane Doe";
        age = 30;
        gender = "female";
        company = "Google";
        hiredStudents = 0;
    }
    public String goal() {
        return "Hire brilliant junior software developers.";
    }

    public int hire(){
        hiredStudents ++;
        return hiredStudents;
    }
    public String generateIntroduction() {
        return "Hi I'm " + name + ", " + age + " year old " + gender + "who represents " + company +" and hired " + hiredStudents + " students so far.";
    }
}
