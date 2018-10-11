public class PrintUsage {
    String header;
    String separator;
    public PrintUsage(){
        header = "Command Line Todo application";
        separator = "=============================";
    }
    public static void commandsPrint(){

        System.out.println("-l Lists all the tasks");
        System.out.println("-a Adds new task");
        System.out.println("-r Removes an task");
        System.out.println("-c Completes an task");
    }

}
