package Practice23;

import Practice24.OrderManager;

public class Test {
    public static void main(String[] args) {
        TablesOrderManager orderManager = new TablesOrderManager(10);
        Order[] orders = new Order[10];
        for (int i = 0; i < orders.length; i++)
            orders[i] = new Order();
        orders[3].add(new Dish(287,"Plate", "Now time to check this"));
        orders[3].add(new Dish(30,"Cup", "It's just for tea"));
        orders[1].add(new Dish(38, "Clock", "This is not a dish!!!"));
        orderManager.add(orders[3], 7);
        orderManager.add(orders[5], 5);
        orderManager.removeOrder(5);
        orderManager.add(orders[1],3);
        System.out.println(orderManager.ordersCostSummary());
        System.out.println(orderManager.freeTableNumbers());
        System.out.println(orderManager.freeTableNumber());
    }
}
