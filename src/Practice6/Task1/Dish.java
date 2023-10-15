package Practice6.Task1;

public abstract class Dish {
    private int height;
    private int width;
    private int length;
    public Dish() {
        height = 100;
        width = 100;
        length = 100;
    }
    public Dish(int height, int length, int width) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Heigth: " + height + "\nWidth: " + width + "\nLength: "+length;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
