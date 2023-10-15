package Practice6;

import Practice6.Task1.Dish;
import Practice6.Task1.Dishes.Plate;
import Practice6.Task1.Dishes.Cup;
import Practice6.Task2.Dog;
import Practice6.Task2.Dogs.Chihuahua;
import Practice6.Task2.Dogs.Sheepdog;
import Practice6.Task3.FurnitureShop;

public class Test {
    public static void main(String[] args) {
        Dish dish = new Cup();
        Dog dog = new Chihuahua();
        Dish dish1 = new Plate();
        Dog dog1 = new Sheepdog();
        System.out.println(dish);
        System.out.println("________");
        System.out.println(dog);
        System.out.println("________");
        System.out.println(dish1);
        System.out.println("________");
        System.out.println(dog1);
        System.out.println("________");
        FurnitureShop shop = new FurnitureShop();
        System.out.println(shop);
    }
}
