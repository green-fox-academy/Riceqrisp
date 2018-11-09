package Main.Controllers;

import Main.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    List<Fox> allPets = new ArrayList<Fox>();

    @GetMapping(value = "")
    public String ctrlMain() {
        return "index";
    }

    ArrayList<Fox> allFoxes = new ArrayList<>();

    //    @GetMapping(value = "/login")
//    public String getLogin(){
//    return"login";
//        }
    @GetMapping(value = "/login")
    public String getLogin() {
//            allFoxes.add(new Fox(name));
//            model.addAttribute("petName",name);
        return "login";
    }

    @PostMapping(value = "/index")
    public String postLogin(@RequestParam("petName") String name, Model model) {
        if (allFoxes.isEmpty()) {
            name = "Mr. Fox";
            model.addAttribute("petName", name);
        } else {
            model.addAttribute("petName", name);
            allFoxes.add(new Fox(name));
        }
        return"index";
        }
        @GetMapping(value = "/tricks")
        public String loginToFox(){
            return "tricks";
        }
    }


