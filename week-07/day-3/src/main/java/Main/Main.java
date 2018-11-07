package Main;

import Main.Color.BlueColor;
import Main.Color.MyColor;
import Main.Services.Printer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

//    @Autowired
//    Printer myLog;

//    @Autowired
//    MyColor anycolor;

    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);

    }
    @Override
    public void run(String... args) throws Exception {
        //myLog.log("hello");
  //      anycolor.printColor();
    }

}