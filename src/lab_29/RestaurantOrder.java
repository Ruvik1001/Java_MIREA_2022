package lab_29;

public class RestaurantOrder implements Order {

    InternetOrder internetOrder = new InternetOrder();
    @Override
    public boolean add(MenuItem item) {
        return internetOrder.add(item);
    }

    @Override
    public boolean remove(String itemName) {
        return internetOrder.remove(itemName);
    }

    @Override
    public int removeAll(String itemName) {
        return internetOrder.removeAll(itemName);
    }

    @Override
    public int removeAll(MenuItem item) {
        return internetOrder.removeAll(item);
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        return internetOrder.sortedItemsByCostDesc();
    }

    @Override
    public int costTotal() {
        return internetOrder.costTotal();
    }

    @Override
    public int size() {
        return internetOrder.size();
    }

    @Override
    public String[] nameOfItems() {
        return internetOrder.nameOfItems();
    }

    public void display() {
         internetOrder.display();
    }
}
