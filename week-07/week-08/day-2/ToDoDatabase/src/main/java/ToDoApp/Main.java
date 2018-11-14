package ToDoApp;

import ToDoApp.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Main implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
    @Autowired
    ToDoRepository repository;
    @Override
    public void run(String... args){
        repository.save(new Todo("I have to learn Object Relational Mapping"));
        repository.save(new Todo("Dude"));
        repository.save(new Todo("something"));
        repository.save(new Todo("tasks & dragons"));
        repository.save(new Todo("next exercise"));
    }
}
