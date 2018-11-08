package Main.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping(value = "")
    public String ctrlMain() {
        return "index";
    }
    @GetMapping(value = "/login")
    public String getLogin(){
    return"login";
        }
}

