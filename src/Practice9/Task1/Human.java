package Practice9.Task1;

public class Human implements Nameable {
    private String name;
    public Human() {
        name = "John";
    }
    public Human(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
}
