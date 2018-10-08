public class Sharpies  {
    public String color;
    public Double width;
    public Double inkAmount;
    public Sharpies(String color,Double width) {
        inkAmount = 100.0;
    }
    public void use(){
        inkAmount--;
    }

    public static void main(String[] args) {
        Sharpies yellowSharpie = new Sharpies("yellow",3.0);

        yellowSharpie.use();
        yellowSharpie.use();
        yellowSharpie.use();
        yellowSharpie.use();
        yellowSharpie.use();

        System.out.println(yellowSharpie.inkAmount);
    }
}
