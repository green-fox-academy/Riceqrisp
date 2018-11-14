package ToDoApp.Controller;

import ToDoApp.Repository.ToDoRepository;
import ToDoApp.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/todo")
    public class FirstController {

    @Autowired
    ToDoRepository repository;

    @GetMapping (value = "")
    public String todo(){
        return "Welcome to ToDo app";
    }
    @RequestMapping(value = {"/","/list"})
    public String list(Model model){
        model.addAttribute("todos",repository.findAll());
    return "todo";
    }
    @GetMapping(value = {"/add"})
    public String add(Model model){
        model.addAttribute("todo",new Todo());
        return "add";
    }
    @PostMapping(value = "/add")
    public String submit(@ModelAttribute Todo todo){
        repository.save(todo);
        return "redirect:/todo/";
    }
    @RequestMapping(value = "/{id}/delete")
    public String delete(@PathVariable long id){
        repository.deleteById(id);
        return "redirect:/todo/";
    }
    @RequestMapping(value = "/{id}/done")
    public String done(@PathVariable long id){

        return "redirect:/todo/";
    }
}
//        Create a new controller called TodoController which maps to /todo
//        Add a public String list() method which maps to / and /list in the controller,
//        which returns with "This is my first todo" string. Use the @ResponseBody annotation.
//        Run the application. If all works fine, then you can go ahead.