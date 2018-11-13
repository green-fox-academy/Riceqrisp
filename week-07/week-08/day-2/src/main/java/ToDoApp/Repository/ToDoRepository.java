package ToDoApp.Repository;

import ToDoApp.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface ToDoRepository extends CrudRepository<Todo,Long> {

}
