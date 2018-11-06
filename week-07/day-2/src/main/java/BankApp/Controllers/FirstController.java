package BankApp.Controllers;

import BankApp.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

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
    @GetMapping(value = "/account")
    public String accountDisplay(Model model){
        ArrayList<BankAccount> lionKingChars = new ArrayList<>();

        lionKingChars.add(new BankAccount("Zazu","bird",3000));
        lionKingChars.add(new BankAccount("Nala","lion",200));
        lionKingChars.add(new BankAccount("Mufasa","lionKing",4000));
        lionKingChars.add(new BankAccount("Rafiki","monkey",1));

        model.addAttribute("lionKing", lionKingChars);
        return"multipleAcccounts";
    }
}
