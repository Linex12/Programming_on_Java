package Practice9.Task1;

public class Country implements Nameable {
    private String name;
    public Country() {
        name = "Russia";
    }
    public Country(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
}
