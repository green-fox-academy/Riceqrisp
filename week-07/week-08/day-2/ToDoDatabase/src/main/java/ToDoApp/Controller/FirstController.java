package ToDoApp.Controller;

import ToDoApp.Repository.ToDoRepository;
import ToDoApp.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/todo")
public class FirstController implements CommandLineRunner {

    @Autowired
    ToDoRepository repository;

    @GetMapping (value = "")
    public String todo(){
        return "Welcome to ToDo app";
    }
    @RequestMapping(value = {"/","/list"})
    public String list(){
        //model.addAttribute()
    return "todo";
    }
    @Override
    public void run(String... args){
        repository.save(new Todo("I have to learn Object Relational Mapping"));
        repository.save(new Todo("I have to learn Object Relational Mapping"));
        repository.save(new Todo("I have to learn Object Relational Mapping"));
    }

}
//        Create a new controller called TodoController which maps to /todo
//        Add a public String list() method which maps to / and /list in the controller,
//        which returns with "This is my first todo" string. Use the @ResponseBody annotation.
//        Run the application. If all works fine, then you can go ahead.