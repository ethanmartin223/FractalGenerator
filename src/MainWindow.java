import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    public MainWindow() {

        //win settings
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setTitle("ConwaysGameOfLife");
        setLocationRelativeTo(null);
        setLayout(new GridLayout());
        setResizable(false);

        int[] xPoly = new int[]{150,250,325,375,450,275,100};
        int[] yPoly = new int[]{150,100,125,225,250,375,300};

        Polygon fractalComponent = new Polygon(xPoly, yPoly, xPoly.length);
        Fractal fractal  = new Fractal(this,60, 60, fractalComponent, 1);

        fractal.render();

        //set main to visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainWindow();
    }
}
