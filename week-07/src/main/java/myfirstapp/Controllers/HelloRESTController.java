package myfirstapp.Controllers;

import myfirstapp.Greeting;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;


@RestController
public class HelloRESTController {
    AtomicLong count = new AtomicLong();
    @RequestMapping(value="/greeting")
    public Greeting greetSomebody(@RequestParam (value = "name") String name){

        return new Greeting(count.getAndIncrement(),"Hello " + name);
    }
}
