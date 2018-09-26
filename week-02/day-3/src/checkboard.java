import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class checkboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        int xb = 0;
        int xw = 20;
        int yb = 0;
        int yw = 0;
        int swap = 0;
        for (int j = 0; j < 8 ; j++)
        {
            for (int i = 0; i < 8; i++) {

                if (j%2 == 0 ) {
                    xb = 20;
                    xw = 0;

                    patternBlack(xb, yb, graphics);

                    patternWhite(xw, yw, graphics);

                    xb = xb + 40;
                    xw = xw + 40;
                }
                else{
                    patternBlack(xb, yb, graphics);

                    patternWhite(xw, yw, graphics);

                    xb = xb + 40;
                    xw = xw + 40;
                }
            }


            yb = yb + 20;
            yw = yw + 20;
        }



    }
    public static void patternBlack(int xb,int yb, Graphics graphics) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(xb, yb, 20, 20);
    }
    public static void patternWhite(int xw,int yw, Graphics graphics) {

        graphics.setColor(Color.WHITE);
        graphics.fillRect(xw, yw, 20, 20);
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