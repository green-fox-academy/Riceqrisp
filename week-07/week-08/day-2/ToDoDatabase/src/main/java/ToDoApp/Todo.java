package ToDoApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//not working table for done
//
@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    long id;
    String title;
    boolean urgent;
    boolean done;

    public void setDone(boolean done) {
        this.done = done;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean getIsUrgent() {
        return urgent;
    }

    public boolean getIsDone() {
        return done;
    }

    public Todo() {
    }

    public Todo(String title) {
        this.title = title;

    }

}
