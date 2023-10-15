package Practice24;

public class Test {
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager(10);
        Order[] orders = new Order[10];
        for (int i = 0; i < orders.length; i++)
            orders[i] = new RestaurantOrder();
        orders[3].add(new Dish(287,"Plate", "Now time to check this"));
        orders[4].add(new Drink(30,"Cup", "It's just for tea"));
        orders[2].add(new Drink(32,"Cup", "It's just for tea"));
        orderManager.add(orders[3], 7);
        orderManager.add(orders[4], 6);
        orderManager.add(orders[3],2);
        orderManager.add("1", orders[3]);
        System.out.println(orderManager.getOrder("1").getItems());
        System.out.println(orderManager.freeTableNumbers());
    }
}
