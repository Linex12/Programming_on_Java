package Practice6.Task3;

import Practice6.Task3.Furnitures.Closet;
import Practice6.Task3.Furnitures.Sofa;

public class FurnitureShop {
    private Furniture f1;
    private Furniture f2;
    private int price1;
    private int price2;
    public FurnitureShop() {
        f1 = new Closet();
        price1 = 100;
        f2 = new Sofa();
        price2 = 200;
    }
    public FurnitureShop(int price1, int price2) {
        f1 = new Closet();
        this.price1 = price1;
        f2 = new Sofa();
        this.price2 = price2;
    }

    @Override
    public String toString() {
        return "Closet price: " + price1 + "\nCloset characteristics:\n" + f1 +
                "\nSofa price: " + price2 + "\nSofa characteristics:\n" + f2;
    }
}
