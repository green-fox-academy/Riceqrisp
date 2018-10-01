import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FillRectangle {

    public static void mainDraw(Graphics graphics) {
        // draw four different size and color rectangles.
        // avoid code duplication.

        for (int i = 0; i < 100; i++) {

            int x1 = (int) (Math.random() * 1000);
            int x2 = (int) (Math.random() * 1000);

            int y1 = (int) (Math.random() * 1000);
            int y2 = (int) (Math.random() * 1000);

            int r = (int) (Math.random() * 256);
            int g = (int) (Math.random() * 256);
            int b = (int) (Math.random() * 256);


             if ((x1 != x2) || (y1!= y2)) {

                 //color = new Color(r, g, b);

            Rect1(x1, x2, y1, y2, r, g, b, graphics);

             }
             else {i--;
             }
        }
        //Rect1(50, 50, 50, 50, "GREEN", graphics);
        }
    public static void Rect1(int x1, int x2, int y1, int y2, int r,int g, int b, Graphics graphics) {

        Color myWhite = new Color(r, g, b);
        graphics.setColor(myWhite);

        graphics.fillRect(x1, y1, x2, y2);
    }

    //    Don't touch the code below
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
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}