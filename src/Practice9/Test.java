package Practice9;

import Practice9.Task1.Country;
import Practice9.Task1.Human;
import Practice9.Task2.Money;
import Practice9.Task2.Rocket;

public class Test {
    public static void main(String[] args) {
        Human human = new Human();
        Money money = new Money();
        Country country = new Country();
        Rocket rocket = new Rocket();
        System.out.println(human.getName());
        System.out.println(money.getPrice());
        System.out.println(country.getName());
        System.out.println(rocket.getPrice());
    }
}
