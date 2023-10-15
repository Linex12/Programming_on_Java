package Practice8.Task1;

import java.awt.*;
import java.util.Random;

public abstract class Shape {
    private Color color;
    private int x;
    private int y;
    private int width;
    private int height;
    public Shape() {
        color = Color.black;
        x = 0;
        y = 0;
        width = 0;
        height = 0;
    }
    public Shape(int x, int y, int width, int height, Color color) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Color getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public static Color getrandomColor() {
        Random random = new Random();
        int c = random.nextInt(0, 9);
        switch (c) {
            case 0:
                return Color.black;
            case 1:
                return Color.red;
            case 2:
                return Color.green;
            case 3:
                return Color.blue;
            case 4:
                return Color.cyan;
            case 5:
                return Color.yellow;
            case 6:
                return Color.magenta;
            case 7:
                return Color.orange;
            case 8:
                return Color.pink;
        }
        return Color.black;
    }
}
