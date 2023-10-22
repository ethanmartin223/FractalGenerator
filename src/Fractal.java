import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Fractal {

    int x, y;
    int iterations;
    Polygon component;
    JFrame parent;

    public Fractal(JFrame parentWindow, int centerX, int centerY, Polygon fractalComponent, int numberOfIterations) {
        component = fractalComponent;
        x = centerX;
        y = centerY;
        iterations = numberOfIterations;
        parent = parentWindow;
    }

    public void render() {
        ArrayList<FractalPart> fractalParts = new ArrayList<>();
        fractalParts.add(new FractalPart(parent, x,y,component, 0));

    }
}
