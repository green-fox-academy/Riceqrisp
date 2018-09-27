import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/*public class bowl {
    public static void mainDraw(Graphics graphics) {

        for (int i = 0; i < 320; i+=20) {

            graphics.setColor(Color.GREEN);
            graphics.drawLine(WIDTH -i,HEIGHT,0,HEIGHT-i);
            graphics.setColor(Color.MAGENTA);
            graphics.drawLine(0+i,0,WIDTH,i);

        }


        }



    }
   /* public static void line(int x,int y,int x1, int y1,Graphics graphics){
        graphics.setColor(Color.GREEN);
        graphics.drawLine(x,y,x1,y1);
        //graphics.drawLine(1,1,1,1);
    }*/

    // Don't touch the code below
/*    static int WIDTH = 320;
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
} */