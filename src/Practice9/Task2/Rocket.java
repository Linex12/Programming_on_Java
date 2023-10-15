package Practice9.Task2;

public class Rocket implements Priceable{
    private int price;
    public Rocket() {
        price = 1000000;
    }
    public Rocket(int price) {
        this.price = price;
    }
    @Override
    public int getPrice() {
        return price;
    }
}
