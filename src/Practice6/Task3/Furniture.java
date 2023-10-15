package Practice6.Task3;

public abstract class Furniture {
    private int height;
    private int width;
    private int length;
    public Furniture() {
        height = 500;
        width = 200;
        length = 200;
    }
    public Furniture(int height, int length, int width) {
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
