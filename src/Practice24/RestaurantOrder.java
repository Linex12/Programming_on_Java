package Practice24;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RestaurantOrder implements Order {
    private int size;
    private List<Item> items;
    public RestaurantOrder() {
        this.items = new ArrayList<>();
    }
    public RestaurantOrder(ArrayList<Item> items) {
        this.items = items;
    }
    public boolean add(Item item) {
        try {
            items.add(item);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean remove(String itemName) {
        try {
            int size = items.size();
            int chosenposition = -1;
            for (int i = 0; i < size; i++) {
                if (items.get(i).getName() == itemName)
                    chosenposition = i;
            }
            items.remove(chosenposition);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public int removeAll(String itemName) {
        int count = 0;
        int size = items.size();
        for (int i = 0; i < size; i++) {
            if (items.get(i).getName() == itemName) {
                items.remove(i);
                count++;
            }
        }
        return count;
    }
    public List<Item> getItems() {
        return items;
    }
    public double costTotal() {
        double result = 0.0;
        for (Item item : items) {
            result += item.getCost();
        }
        return result;
    }
    public int itemQuantity(String itemName) {
        int quantity = 0;
        for (Item item : items) {
            if (item.getName() == itemName)
                quantity++;
        }
        return quantity;
    }
    public String[] itemsNames() {
        int size = items.size();
        String[] results = new String[size];
        for (int i = 0; i < size; i++) {
            results[i] = items.get(i).getName();
        }
        return results;
    }
    public List<Item> sortedItemsByCostDesc() {
        List<Item> itemscopy = new ArrayList<>(items);
        itemscopy.sort(new Comparator<Item>() {
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
        return itemscopy;
    }
}
