import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class newcheckboard {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.
        int x = 0;
        int y =0;
        int x2 =WIDTH/2;
        int y2 = HEIGHT/2;

        for (int i = 0; i <= 320; i+=20) {

            x = i;
            line(x,y,x2,y2,graphics);

            if (x == 320){
                for (int j = 0; j <= 340 ; j+=20) {

                    y = j;
                    line(x,y,x2,y2,graphics);

                    if (y == 340){
                        for (int k = 320; k >= 0 ; k-=20) {

                            x = k;
                            line(x,y,x2,y2,graphics);

                            if (x == 0)
                            {
                                for (int l = 340; l >=0 ; l-=20) {

                                    y = l;
                                    line(x,y,x2,y2,graphics);
                                }
                            }
                        }
                    }
               }
            }
        }

    }

    public static void line (int x,int y,int x2, int y2, Graphics graphics){

        graphics.drawLine(x,y,x2,y2);

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