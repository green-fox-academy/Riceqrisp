public class Counter {
    int value;

    public Counter() {
        value = 0;
    }
    public void add(int number) {
        this.value = value + number;
    }
    public void add(){
        value++;
    }
    public void get(int number) {
        this.value = value+number;
    }

    public void reset() {
        value = 0;
    }

    public static void main(String[] args) {
        Counter c = new Counter();
        c.add(10);
        System.out.println(c.value);
    }
}
