import java.util.Arrays;

public class StoriesToDo {
    public static void main(String[] args) {
        if(args.length == 0) {
            //Printing intro if there are no args
            PrintUsage intro = new PrintUsage();
            System.out.println(intro.header);
            System.out.println(intro.separator);
            intro.commandsPrint();

            //Test of args print:
            System.out.println(args.toString());
        }
        else if (args[0].equals("-a")){
            ListTasks task = new ListTasks();
            for (int i = 0; i <args.length ; i++) {
                task.addToList(args[i+1].concat(args[i+1]+" "));
            }
            task.writeToFile();
            //remove all arguments from args method
            Arrays.fill(args,null);
        }
        else if (args[0] =="-l"){
            ListTasks task = new ListTasks();
            task.readFromStorage();
            //remove from args method
            Arrays.fill(args,null);
        }
        else if (args[0] == "-r"){
            ListTasks task = new ListTasks();

            //method for removing indexes from task.content array from the file Storage
            for (int i = 0; i <args.length ; i++) {

            }
        }
        else if (args[0] == "-c"){
            ListTasks task = new ListTasks();
            //task.removeTask();
            //remove from args method
            Arrays.fill(args,null);
        }
    }
}
