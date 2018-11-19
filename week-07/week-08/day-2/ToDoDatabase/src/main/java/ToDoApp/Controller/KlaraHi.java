package ToDoApp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KlaraHi {

    @RequestMapping("/klarinka")

    public String KlarinkaHelloString(){
    return "Hi Klara";
    }
}

