package checkApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

    @GetMapping("/")
    public String goToIndex(){
        return "index";
    }
    @GetMapping("/doubling")
    public String doubling(){

            return "index";
        }

}
