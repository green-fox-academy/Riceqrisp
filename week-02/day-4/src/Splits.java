import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Splits {
    public static void mainDraw(Graphics graphics) {

        int x = 0;
        int y = 32;
        int x1 = 0;
        int y1 = 0;
        int x2 = 80;
        int y2 = 0;
        int x3 = 0;
        int y3 = 0;

            for (int i = 0; i < 15; i+=1) {

                x = (x + 5);
                x1 = 0;
                y1 = (y1 + 5);
                // line(0, 320, 0, 20)
                // line (20, 320, -20, 40)
                line(x, y, x1, y1, graphics);
            }
            for (int j = 0; j < 15; j+=1) {
                x2 = 80;
                y2 = y2 + 5;
                x3 = x3 + 5;
                y3 = 0;
                line2(x2, y2, x3, y3, graphics);
            }

    }
    public static void line(int x,int y,int x1, int y1,Graphics graphics){
        graphics.setColor(Color.GREEN);
        graphics.drawLine(x,y,x1,y1);
        //graphics.drawLine(1,1,1,1);
    }
    public static void line2(int x2,int y2,int x3, int y3,Graphics graphics){
        graphics.setColor(Color.PINK);
        graphics.drawLine(x2,y2,x3,y3);
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
