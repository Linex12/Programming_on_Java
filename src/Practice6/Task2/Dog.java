package Practice6.Task2;

public abstract class Dog {
    private String size;
    private int weight;
    public Dog() {
        size = "Normal";
        weight = 30;
    }
    public Dog(String size, int weight) {
        this.size = size;
        this.weight = weight;
    }
    public String getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String toString() {
        return "Size: " + size + "\nWeight: " + weight;
    }
}
