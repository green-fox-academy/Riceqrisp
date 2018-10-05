import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Fractaltattoo {
    public static void mainDraw ( Graphics graphics) {
        FractalHash1(0,0,WIDTH,graphics);

    }
    public static void FractalHash1(int x,int y, int size,Graphics graphics) {
        if (size > 0) {
            graphics.drawLine(size / 3+x, y, size / 3+x, size+y);
            graphics.drawLine(x, size / 3+y, size+x, y+size / 3);
            graphics.drawLine(x, y+size * 2 / 3, x+size, y+size * 2 / 3);
            graphics.drawLine(x+size * 2 / 3, y, x+size * 2 / 3, y+size);

            FractalHash1 (size / 3 + x ,y,size/3,graphics);
            FractalHash1 (x,size / 3 + y,size/3,graphics);
            FractalHash1 (size / 3 + x ,y,size*3,graphics);
            FractalHash1 (x,size / 3 + y,size*3,graphics);



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



