import javax.swing.*;

import java.awt.*;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeSimple {
    public static void mainDraw(Graphics graphics) {

        int x = 0;
        int y = 0;
        int x1 = 0;
        int y2 = 0;

        for (int i = 0; i < 16 ; i++) {
            x =  WIDTH/2;
            y =  HEIGHT/2-10;
            x1 = WIDTH/-10;
            y2 = HEIGHT/2;


            // line(0, 320, 0, 20)
            // line (20, 320, -20, 40)
            line3(x,y,x1,y1,graphics);
        }

    public static void line3(int x,int y,int x1, int y1,Graphics graphics){

        }
        graphics.setColor(Color.GREEN);
        graphics.drawLine(x,y,x1,y1);
        //graphics.drawLine(1,1,1,1);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}