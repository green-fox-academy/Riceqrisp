public class Person {
    String name;
    int age;
    String gender;
    public Person() {
        name = "Jane Doe";
        age = 30;
        gender = "female";
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    public void introduce() {
        System.out.println(generateIntroduction());
    }
    public String generateIntroduction () {
        return "Hi I'm " + name + ", " + age + " year old " + gender;
    }
    public String goal() {
        return "My goal is: Live for the moment!";
    }
    public void getGoal() {
        System.out.println(goal());
    }
}

