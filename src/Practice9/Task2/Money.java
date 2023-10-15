package Practice9.Task2;

public class Money implements Priceable {
    private int price;
    public Money() {
        price = 100;
    }
    public Money(int price) {
        this.price = price;
    }
    @Override
    public int getPrice() {
        return price;
    }
}
