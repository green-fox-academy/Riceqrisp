import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class lineplay {
    public static void mainDraw(Graphics graphics) {

        int x = 0;
        int y = 320;
        int x1 = 20;
        int y1 = 0;
        int x2 = 320;
        int y2 = 0;
        int x3 = 0;
        int y3 = 0;

        for (int i = 0; i < 15 ; i++) {

            x = x + 20;
            x1 = 0;
            y1 = y1 + 20;
            line(x,y,x1,y1,graphics);
        }
        for (int j = 0; j < 15; j++) {
            x2 = 320;
            y2 = y2 + 20;
            x3 = x3 + 20;
            y3 = 0;
            line2(x2,y2,x3,y3,graphics);

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