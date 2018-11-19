package checkApp;

import org.springframework.beans.factory.annotation.Autowired;

public class GreeterTo extends Greeter{

    Greeter dude;
    String welcome_message;

    public GreeterTo(Greeter dude) {
        super();
        this.welcome_message = "Oh, hi there " + dude.name + ", dear " + dude.title;
    }

}
