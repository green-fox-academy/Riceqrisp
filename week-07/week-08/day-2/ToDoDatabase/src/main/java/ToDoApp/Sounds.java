package ToDoApp;

import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
//should I have it as service? or Component?
public class Sounds implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        playsound();
    }
    public static void playsound(){
        AudioPlayer MGP = AudioPlayer.player;
        AudioStream BGM;
        AudioData MD;
        ContinuousAudioDataStream loop = null;
        try{
            //Where should be the file?
            BGM = new AudioStream(new FileInputStream(("Kid_Laugh.wav")));
        }catch (IOException E){
            System.out.println("wrong file location duuuude");
        }
        MGP.start(loop);

    }
}
