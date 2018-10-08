public class Mentor extends Person {
    String level;
    public Mentor(String name,int age, String gender,String level) {
        super(name,age,gender);
        this.level = level;
    }
    public Mentor(){
        name = "Jane Doe";
        age = 30;
        gender = "female";
        level = "mentor";
    }
    public String goal() {
        return "Educate brilliant students";
    }
    public String introduce(String introduction){
        return generateIntroduction();
    }

}
