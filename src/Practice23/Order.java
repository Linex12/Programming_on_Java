package Practice23;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Order {
    private int size;
    private List<Dish> dishes;
    public Order() {
        dishes = new ArrayList<>();
    }
    public Order(ArrayList<Dish> dishes) {
        this.dishes = dishes;
    }
    public boolean add(Dish dish) {
        try {
            dishes.add(dish);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean remove(String dishName) {
        try {
            int size = dishes.size();
            int chosenposition = -1;
            for (int i = 0; i < size; i++) {
                if (dishes.get(i).getName() == dishName)
                    chosenposition = i;
            }
            dishes.remove(chosenposition);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public int removeAll(String dishName) {
        int count = 0;
        int size = dishes.size();
        for (int i = 0; i < size; i++) {
            if (dishes.get(i).getName() == dishName) {
                dishes.remove(i);
                count++;
            }
        }
        return count;
    }
    public List<Dish> getDishes() {
        return dishes;
    }
    public double costTotal() {
        double result = 0.0;
        for (Item item : dishes) {
            result += item.getCost();
        }
        return result;
    }
    public int dishQuantity(String dishName) {
        int quantity = 0;
        for (Item item : dishes) {
            if (item.getName() == dishName)
                quantity++;
        }
        return quantity;
    }
    public String[] dishesNames() {
        int size = dishes.size();
        String[] results = new String[size];
        for (int i = 0; i < size; i++) {
            results[i] = dishes.get(i).getName();
        }
        return results;
    }
    public Item[] sortedItemsByCostDesc() {
        dishes.sort(new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                if (o1.getCost() < o2.getCost())
                    return 1;
                else if (o1.getCost() < o2.getCost())
                    return -1;
                else
                    return 0;
            }
        });
        return null;
    }
}
