package Practice24;

public final class Dish implements Item {
    private double cost;
    private String name;
    String description;
    public Dish(String name, String description) {
        cost = 0;
        this.name = name;
        this.description = description;
    }
    public Dish(double cost, String name, String description) {
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

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return "\n"+getClass()+"\nCost: " + getCost() + "\nName: " + getName() + "\nDescription: " + getDescription() + "\n";
    }
}
