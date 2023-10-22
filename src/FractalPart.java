import javax.swing.*;
import java.awt.*;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class FractalPart extends JComponent {
    private static int scale = 100;

    private int x, y;
    private Polygon shape;
    private CordinatePoint[] nextFractalCenters;
    private int rotation;

    public FractalPart(JFrame parentWindow, int centerX, int centerY, Polygon shape, int rotation) {
        this.x = centerX;
        this.y = centerY;


        int[] xpointsCopy = new int[shape.xpoints.length], ypointsCopy = new int[shape.xpoints.length];
        System.arraycopy(shape.xpoints, 0, xpointsCopy, 0, shape.xpoints.length);
        System.arraycopy(shape.ypoints, 0, ypointsCopy, 0, shape.ypoints.length);



        this.shape = shape;
        this.rotation = rotation;
        setLocation(x, y);
        parentWindow.add(this);
    }

    public void setRecursionPoints(CordinatePoint[] points) {
        nextFractalCenters = points;
    }

    private static int[] rotate_point(float cx, float cy, float angle, int px, int py) {
        double s = sin(angle);
        double c = cos(angle);
        px -= cx;
        py -= cy;

        double xNew = px * c - py * s;
        double yNew = px * s + py * c;
        px = (int) (xNew + cx);
        py = (int) (yNew + cy);
        return p;
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setColor(Color.BLACK);
        g2D.drawPolygon(shape);
    }
}