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
            //System.out.println(args.toString());
        }
        else if (args[0].equals("-a")){
            // below line to be removed.
            ListTasks task = new ListTasks();
            String newtask = "";
            for (int i = 1; i < args.length ; i++) {
               // task.addToList(args[i].concat(" ")); I am doing the same below but with newtask variable
                newtask = newtask + args[i] + " ";

            }
            task.writeToFile(newtask);
            task.readFromStorage();
        }
        else if (args[0].equals("-l")){
            ListTasks task = new ListTasks();
            task.readFromStorage();
        }
        else if (args[0].equals("-r")){
            ListTasks task = new ListTasks();

            //method for removing indexes from task.content array from the file Storage
            for (int i = 0; i < args.length ; i++) {

            }
        }
        else if (args[0].equals("-c")){
            ListTasks complete = new ListTasks();
            int index = Integer.parseInt(args[1]);
            complete.completed(index);
            complete.readFromStorage();
        }
        else if(args[0].equals("-JackSparrow")){
            ListTasks doesntMatter = new ListTasks();
            doesntMatter.easterEggBeard(args[0]);
        }
        //remove from args method
        Arrays.fill(args,null);
    }
}
