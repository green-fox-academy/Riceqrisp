public class StoriesToDo {
    public static void main(String[] args) {
        PrintUsage intro = new PrintUsage();
        System.out.println(intro.header);
        System.out.println(intro.separator);
        intro.commandsPrint();
        //Test of args print:
        System.out.println(args.toString());
    }
}
