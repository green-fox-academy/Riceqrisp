package checkApp;

import checkApp.*;
import checkApp.Error;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/dountil/{action}/{number}")
    public Object doUntil(@PathVariable(value = "action",required = false) String action,
                          @PathVariable(value = "number",required = false) Integer n){
        if (n == null){
            Error noNumber = new Error("No number provided");
        return noNumber;
        }
        doUntil one = new doUntil(action,n);
        return one;
    }
}