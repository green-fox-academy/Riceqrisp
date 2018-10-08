import java.util.ArrayList;
import java.util.List;

public class Animal {
    public int hunger;
    public int thirst;
    public int age;
    public List learn;
    public Animal() {
        hunger = 50;
        thirst = 50;
        age = 0;
    }
    public void eat() {
        hunger--;
    }
    public void drink() {
        thirst--;
    }
    public void expierience() {
        age++;
    }
    public void play() {
        thirst++;
        hunger++;
    }
    public void death(){
            if (hunger >= 100 || thirst >= 100){
                System.out.println("Sorry Your Animal just died... out of thirst or hunger you name it! :D");
            }
    }

    public static void main(String[] args) {

        Animal bubak = new Animal();
        bubak.eat();
        bubak.eat();
        bubak.eat();
        bubak.eat();
        bubak.eat();
        bubak.eat();
        bubak.eat();
        bubak.eat();
        bubak.eat();
        bubak.eat();
        bubak.play();
        bubak.play();
        bubak.play();
        bubak.play();

        for (int i = 0; i < 50 ; i++) {
            bubak.play();
        }
        System.out.println(bubak.hunger);
        System.out.println(bubak.thirst);
        bubak.death();

        System.out.println(bubak.thirst);
    }
}
