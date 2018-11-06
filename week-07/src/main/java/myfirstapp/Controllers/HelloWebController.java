package myfirstapp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
    AtomicLong count = new AtomicLong();
    @RequestMapping("/web/greeting")
    public String greeting(Model model) {
        count.getAndIncrement();
        String counter = count.toString();
        model.addAttribute("name", " World");
        model.addAttribute("count",counter);
        return "greeting";
    }
}
