package lab_30;

public class TableOrdersManager implements OrdersManager{
    private Order[] orders;
    private int tableTotal;

    public TableOrdersManager(int size) {
        orders = new Order[size];
    }


    void add(Order order, int tableNumber){
        orders[tableNumber] = order;
    }

    void addItem(MenuItem item, int tableNumber){
        orders[tableNumber].add(item);
    }

    int freeTableNumber(){
        int sum = 0;
        for (int i = 0 ; i  < tableTotal; i ++){
            if(orders[i] == null) sum++;
        }
        return  sum;
    }

    int[] freeTableNumbers(){
        int[] freeTables = new int[freeTableNumber()];
        int j = 0;
        for (int i = 0 ; i  < tableTotal; i ++){
            if(orders[i] == null) freeTables[j++] = i;
        }
        return freeTables;
    }

    Order getOrder(int tableNumber)
    {
        return orders[tableNumber];
    }
    void remove(int tableNumber){
        orders[tableNumber] = null;
    }
    int remove(Order order){
        int i = 0;
        for (i = 0; i < tableTotal; i++){
            if(orders[i] == order) {
                remove(i);
                return i;
            }
        }
        return -1;
    }

    int removeAll(Order order){
        int sum = 0;
        for ( int i = 0; i < tableTotal; i++){
            if(orders[i] == order) {
                remove(i);
                sum++;
            }
        }
        return sum;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int sum = 0;
        for (int i =0 ; i < tableTotal; i ++ ){
            sum += orders[i].itemQuantity(itemName);
        }
        return sum;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int sum = 0;
        for (int i =0 ; i < tableTotal; i ++ ){
            sum += orders[i].itemQuantity(item);
        }
        return sum;
    }

    @Override
    public Order[] getOrders() {
        return  orders;
    }

    @Override
    public int ordersCostSummary() {
        int summaryCost = 0;
        for (int i = 0; i < tableTotal; i ++)
        {
            summaryCost += orders[i].costTotal();
        }
        return  summaryCost;
    }

    @Override
    public int ordersQuantity() {
        int quantity = 0;
        for (int i = 0 ; i  < tableTotal; i ++){
            if(orders[i] != null) quantity++;
        }
        return quantity;
    }
}
