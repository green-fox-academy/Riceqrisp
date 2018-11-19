package checkApp.Controller;

import checkApp.Doubling;
import checkApp.Error;
import org.springframework.web.bind.annotation.GetMapping;
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
}