package myfirstapp;

public class Greeting {

    static long id = 0;
    String content = "";
public Greeting(long id,String content){
    this.id = id;
    this.content = content;
}
    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}

