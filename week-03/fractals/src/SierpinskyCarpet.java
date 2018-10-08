import javax.swing.*;

import java.awt.*;
import java.awt.image.ImageObserver;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {
    public static void mainDraw ( Graphics graphics) {
        Square(0,0,WIDTH,graphics);

    }
    public static void Square(int x,int y, int size,Graphics graphics) {
        if (size >0) {

           graphics.fillRect(x+size/3,y+size/3,size/3,size/3);
           /* graphics.fillRect(size/3+size/3+size/3+size/3,size/3,size/3,size/3);
            graphics.fillRect(size/3,size/3+size/3+size/3+size/3,size/3,size/3);

            graphics.fillRect(size/3,size/3+size/3+size/3+size/3+size/3+size/3+size/3,size/3,size/3);
            graphics.fillRect(size/3+size/3+size/3+size/3+size/3+size/3+size/3,size/3,size/3,size/3);

            graphics.fillRect(size/3+size/3+size/3+size/3+size/3+size/3+size/3,size/3+size/3+size/3+size/3,size/3,size/3);
            graphics.fillRect(size/3+size/3+size/3+size/3,size/3+size/3+size/3+size/3+size/3+size/3+size/3,size/3,size/3);

            graphics.fillRect(size/3+size/3+size/3+size/3+size/3+size/3+size/3,size/3+size/3+size/3+size/3+size/3+size/3+size/3,size/3,size/3);*/

         Square (x,y,size/3,graphics);
         Square (x+size/3,y,size/3,graphics);
         Square (x,y+size/3,size/3,graphics);
         Square (x,y+size/3,size/3,graphics);
         Square (x+size/3+size/3,y,size/3,graphics);
         Square (x+size/3+size/3,y+size/3+size/3,size/3,graphics);
            Square (x+size/3*4+size/3,y+size/3+size/3,size/3,graphics);

        }
    }


    // Don't touch the code below
    static int WIDTH = 500;
    static int HEIGHT = 500;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}



