package checkApp.Controller;

import checkApp.*;
import checkApp.Error;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;

@RestController
public class AnotherController {
    @GetMapping("/doubling")
    public Object doubleResult(@RequestParam(value = "input", required = false) Integer input){
        if (input == null) {
            Error noInput = new Error("Please provide an input");
            return noInput;
        }else{
            Doubling value = new Doubling(input);
            return value;
        }
        }
    @GetMapping("/greeter")
    public Object greeting(@RequestParam(value = "name", required = false) String name,
                           @RequestParam(value = "title", required = false) String title)
    {   if((name != null) && (title != null)) {
        Greeter first = new Greeter(name, title);
       // GreeterTo dude = new GreeterTo(first);
        return first;
    }else{
        Error noInput = new Error("Please provide a name!");
        return noInput;
    }
    }
    @GetMapping("/appenda/{appendable}")
    public Object appendA(@PathVariable(value = "appendable", required = false) String appendA){
        return new AppendA(appendA);
    }
}