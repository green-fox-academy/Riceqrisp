package ToDoApp.Repository;

import ToDoApp.Todo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface ToDoRepository extends CrudRepository<Todo,Long> {

//    @Query(value = "SELECT * FROM to_do WHERE urgent = true ",
//            nativeQuery=true
//    )
//    public List<ToDo> findUrgent();
}
