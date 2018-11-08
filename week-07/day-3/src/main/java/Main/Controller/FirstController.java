package Main.Controller;

import Main.Services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {

    @Autowired
    UtilityService colors123;

    @GetMapping(value = "/useful")
    public String background(){
        return "Background";
    }
    @GetMapping(value = "/useful/colored")
    public String randomBackground(Model model){
        model.addAttribute("random",colors123.randomColor());

        return "BacgroundColored";
    }
    @RequestMapping("/useful/email")
    //@RequestParam(value = "param1", required = true)
    public String email(){
        return "email";
    }

}
