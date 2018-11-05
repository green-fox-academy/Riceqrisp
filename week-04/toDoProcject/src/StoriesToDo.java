import java.util.Arrays;

public class StoriesToDo {
    public static void main(String[] args) {
        ListTasks task = new ListTasks();

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
            String newtask = "";
            for (int i = 1; i < args.length ; i++) {
                newtask = "0" + newtask + args[i] + " ";
            }
            task.writeToFile(newtask);
            task.readFromStorage();
        }
        else if (args[0].equals("-l")){
            task.readFromStorage();
        }
        else if (args[0].equals("-r")){
            for (int i = 0; i < args.length; i++) {
                int index = Integer.parseInt(args[i]);
                task.remove(index);
            }
        }
        else if (args[0].equals("-c")){

            int index = Integer.parseInt(args[1]);
            task.completed(index);
            task.readFromStorage();
        }
        else if(args[0].equals("-JackSparrow")){
            ListTasks doesntMatter = new ListTasks();
            doesntMatter.easterEggBeard(args[0]);
        }
        //remove from args method
        Arrays.fill(args,null);
    }
}
