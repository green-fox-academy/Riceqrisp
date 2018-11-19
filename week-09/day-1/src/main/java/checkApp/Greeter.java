package checkApp;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;


public class Greeter {
    String name;
    String title;
    String greeting;

    public Greeter(String name, String title) {
        this.name = name;
        this.title = title;
        this.greeting = "oh hi there " + name + ", my dear " + title;
    }

    public Greeter() {

    }

    public String getGreeting() {
        return greeting;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
