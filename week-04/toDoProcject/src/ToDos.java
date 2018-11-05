import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ToDos {

    ArrayList<ToDo> todoList = new ArrayList<>();

public ToDos(){

}
    public void add(String taskName) {
        Path path = Paths.get("src/Storage");
        ToDo task = new ToDo(taskName);
        task.id = todoList.size()+1;
        todoList.add(task);
        try {
            Files.write(path,toLines());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<String> toLines(){
        ArrayList<String> listOfString = new ArrayList<>();
        String line = "";

        for (int i = 0; i < todoList.size(); i++) {
            if(!todoList.get(i).completed) {
                line = Integer.toString(todoList.get(i).id) + ". "+ " [ " + "] " + todoList.get(i).name;
                listOfString.add(line);
            }else{
                line = Integer.toString(todoList.get(i).id) + ". " + " [ " + "x" +"] " + todoList.get(i).name;
                listOfString.add(line);
            }
        }
        return listOfString;
    }
    public void completeToDo(ToDo taskname){
        if (!taskname.completed) {
            taskname.completed = true;
        }
    }
}
