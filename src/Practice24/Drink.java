package Practice24;

public final class Drink implements Item {
    private double cost;
    private String name;
    String description;
    public Drink(String name, String description) {
        cost = 0;
        this.name = name;
        this.description = description;
    }
    public Drink(double cost, String name, String description) {
        if (cost < 0)
            throw new IllegalArgumentException("Cost is below zero");
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    @Override
    public String toString() {
        return "\n"+getClass()+"\nCost: " + getCost() + "\nName: " + getName() + "\nDescription: " + getDescription() + "\n";
    }
}
