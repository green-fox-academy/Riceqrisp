package ToDoApp;

import com.sun.org.glassfish.gmbal.Description;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    long id;
    String title;
    boolean urgent;
    boolean done;

    public Todo() {
    }

    public Todo(String title) {
        this.title = title;

    }

}
