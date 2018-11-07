package Main.Services;

import Main.Color.MyColor;
import Main.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sound.midi.Soundbank;
import java.time.LocalDateTime;

@Service
public class Printer {
    public void log(String message) {
        System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
    }
}