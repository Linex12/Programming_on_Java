package Practice1.Task2;

public class Ball {
    private String type;
    private int size;
    public Ball(String type, int size) {
        this.type = type;
        this.size = size;
    }
    public Ball(String type) {
        this.type = type;
        this.size = 0;
    }
    public Ball() {
        this.type = "Football";
        this.size = 0;
    }
    public String getType() {
        return type;
    }
    public int getSize() {
        return size;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public String toString() {
        return "Type: "+this.type+"\nSize: "+this.size;
    }
}
