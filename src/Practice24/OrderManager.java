package Practice24;

import java.util.ArrayList;
import java.util.HashMap;

public class OrderManager {
    private Order[] orders;
    private HashMap<String, Order> addressAndOrder;
    OrderManager(int tableNumber) {
        if (tableNumber < 0)
            throw new IllegalTableNumber("Minus tables are not possible");
        orders = new Order[tableNumber];
        this.addressAndOrder = new HashMap<>();
    }
    OrderManager(int tableNumber, HashMap<String, Order> addressAndOrder) {
        if (tableNumber < 0)
            throw new IllegalTableNumber("Minus tables are not possible");
        orders = new Order[tableNumber];
        this.addressAndOrder = addressAndOrder;
    }
    public void add(Order order, int tableNumber) {
        if ((tableNumber > orders.length) || (tableNumber < 0))
            throw new IllegalTableNumber("Table is out of bounds");
        else if (orders[tableNumber] != null)
            throw new OrderAlreadyAddedException("This table is already used");
        orders[tableNumber] = order;
    }
    public void add(String address, Order order) {
        addressAndOrder.put(address, order);
    }
    public Order getOrder(int tableNumber) {
        if ((tableNumber > orders.length) || (tableNumber < 0))
            throw new IllegalTableNumber("Table is out of bounds");
        return orders[tableNumber];
    }
    public Order getOrder(String address) {
        return addressAndOrder.get(address);
    }
    public void removeOrder(int tableNumber) {
        if ((tableNumber > orders.length) || (tableNumber < 0))
            throw new IllegalTableNumber("Table is out of bounds");
        orders[tableNumber] = null;
    }
    public void removeOrder(String address) {
        addressAndOrder.remove(address);
    }
    public void addItem(Item item, int tableNumber) {
        if ((tableNumber > orders.length) || (tableNumber < 0))
            throw new IllegalTableNumber("Table is out of bounds");
        orders[tableNumber].add(item);
    }

    public void addItem(String address, Item item) {
        addressAndOrder.get(address).add(item);
    }
    public int freeTableNumber() {
        int count = 0;
        for (Order order : orders)
            if (order == null)
                count++;
        return count;
    }
    public ArrayList<Integer> freeTableNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < orders.length; i++)
            if (orders[i] == null)
                numbers.add(i);
        return numbers;
    }
    public Order[] getRestaurantOrders() {
        return orders;
    }
    public HashMap<String, Order> getInternetOrders() {
        return addressAndOrder;
    }
    public double restaurantOrdersCostSummary() {
        double result = 0.0;
        for (Order order : orders) {
            if (order != null)
                result += order.costTotal();
        }
        return result;
    }
    public double internetOrdersCostSummary() {
        double result = 0.0;
        int size = addressAndOrder.size();
        for (Order order : addressAndOrder.values()) {
            result += order.costTotal();
        }
        return result;
    }
    public int internetItemQuantity(String itemname) {
        int count = 0;
        int size = addressAndOrder.size();
        for (Order order : addressAndOrder.values())
            for (Item item : order.getItems())
                if (item.getName() == itemname)
                    count++;
        return count;
    }
    public int restaurantItemQuantity(String itemname) {
        int count = 0;
        int size = orders.length;
        for (int i = 0; i < size; i++)
            if (orders[i] != null)
                for (Item item : orders[i].getItems())
                    if (item.getName() == itemname)
                        count++;
        return count;
    }
}
/*
public class TablesOrderManager {
    private Order[] orders;
    public TablesOrderManager(int tableNumber) {
        this.orders = new Practice23.Order[tableNumber];
    }
    public TablesOrderManager(Practice23.Order[] orders) {
        this.orders = orders;
    }
    public void add(Order order, int tableNumber) {
        orders[tableNumber] = order;
    }
    public Order getOrder(int tableNumber) {
        return orders[tableNumber];
    }
    public void addDish(Practice23.Dish dish, int tableNumber) {
        orders[tableNumber].add(dish);
    }
    public void removeOrder(int tableNumber) {
        orders[tableNumber] = null;
    }
    public int freeTableNumber() {
        int count = 0;
        for (Order order : orders)
            if (order == null)
                count++;
        return count;
    }
    public ArrayList<Integer> freeTableNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < orders.length; i++)
            if (orders[i] == null)
                numbers.add(i);
        return numbers;
    }

    public Order[] getOrders() {
        return orders;
    }
    public double ordersCostSummary() {
        double result = 0.0;
        for (Order order : orders) {
            if (order != null)
                result += order.costTotal();
        }
        return result;
    }
    public int dishQuantity(String dishname) {
        int count = 0;
        int size = orders.length;
        for (int i = 0; i < size; i++)
            if (orders[i] != null)
                for (Dish dish : orders[i].getDishes())
                    if (dish.getName() == dishname)
                        count++;
        return count;
    }
}
*/