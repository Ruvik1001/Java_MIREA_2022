package lab_30;

import java.util.Arrays;

public class TableOrder implements Order{
    private int size;
    private MenuItem[] items;
    private int index;

    public void display(){
        for (int i = 0; i < size; i++){
            System.out.println(items[i].getName() + " " + items[i].getCost() + " " + items[i].getDescription());
        }
    }
    public TableOrder(int size){
        items = new MenuItem[size];
        index = -1;
    }
    @Override
    public boolean add(MenuItem item) {
        items[++index] = item;
        return true;
    }

    @Override
    public String[] itemsNames() {
        String[] names = new String[size];
        for (int i = 0; i < size; i++){
            names[i] = items[i].getName();
        }
        return names;
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemQuantity(String itemName) {
        int quantity = 0;
        for (int i = 0; i < size; i++){
            if(items[i].getName().equals(itemName)) quantity++;
        }
        return quantity;
    }

    @Override
    public int itemQuantity(MenuItem itemName) {
        int quantity = 0;
        for (int i = 0; i < size; i++){
            if(items[i].equals(itemName)) quantity++;
        }
        return quantity;
    }

    @Override
    public MenuItem[] getItems() {
        return items;
    }

    @Override
    public boolean remove(String itemName) {
        for (int i = 0; i < size; i++){
            if(items[i].getName().equals(itemName)) {
                for (int j = i; j <= size;j++){
                    items[j] = items[j+1];
                }
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(MenuItem item) {
        for (int i = 0; i < size; i++){
            if(items[i].equals(item)) {
                for (int j = i; j <= size;j++){
                    items[j] = items[j+1];
                }
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public int removeAll(String itemName) {
        return 0;
    }

    @Override
    public int removeAll(MenuItem item) {
        return 0;
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        MenuItem[] temp = items;
        Arrays.sort(temp);
        return temp;
    }

    @Override
    public int costTotal() {
       int total = 0;
        for (int i = 0; i < size; i++){
            total += items[i].getCost();
        }
        return total;
    }

    @Override
    public Customer getCustomer() {
        return null;
    }

    @Override
    public void setCustomer(Customer customer) {

    }
}
