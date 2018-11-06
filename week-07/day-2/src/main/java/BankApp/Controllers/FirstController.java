package BankApp.Controllers;

import BankApp.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FirstController {
    @RequestMapping(value = "/show")
    public String getBalance(Model model){
        BankAccount one = new BankAccount("Simba","lion",2000);
        model.addAttribute("name", one.getName());
        model.addAttribute("animalType",one.getAnimalType());
        model.addAttribute("balance",one.getBalance());
        return "BankDisplay";
    }
    @GetMapping(value = "/submit")
    public String submitThis(){
    return"HTMLception";
    }
}
