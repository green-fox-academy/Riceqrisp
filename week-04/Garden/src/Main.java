public class Main {
    public static void main(String[] args) {
    Flower f = new Flower("red");
    Flower f1 = new Flower("yellow");
    Flower f2 = new Flower("Satin");
    tree t1 = new tree("green");

        Garden garden1 = new Garden();

        garden1.Plant(f);

        System.out.println("The " + f.color + " flower" + f.needWaterMessage());
    }
}
