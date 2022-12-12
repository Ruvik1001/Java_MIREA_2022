package lab_30;

public class Restaurant {
    public static void main(String[] args) {
        TableOrdersManager tableOrdersManager = new TableOrdersManager(10);
        Order order = new TableOrder(5);
        order.add(new Dish(500,"Pizza","dish"));
        order.add(new Drink(40,"CocaCola","drink",0,DrinkTypeEnum.SODA));
        tableOrdersManager.add(order,1);
        Order order1 = new TableOrder(5);
        order1.add(new Dish(300,"Pelmeni","dish"));
        order1.add(new Drink(100,"Vodka","drink",37.5,DrinkTypeEnum.VODKA));
        tableOrdersManager.add(order1,2);
        MenuItem[] items = tableOrdersManager.getOrder(1).getItems();
        System.out.println("Table : 1");
        for (int i = 0; i < items.length; i++){
            if(items[i]!=null && items[i] instanceof Dish)
                System.out.println(" " + items[i].getName() + " " + items[i].getCost() + " " + items[i].getDescription());
            else if(items[i]!=null && items[i] instanceof Drink)
                System.out.println(" " + items[i].getName() + " " + items[i].getCost() + " " + items[i].getDescription() + " " + ((Drink) items[i]).getAlcoholVol() + " " + ((Drink) items[i]).getType());
        }
        items = tableOrdersManager.getOrder(2).getItems();
        System.out.println("Table : 2");
        for (int i = 0; i < items.length; i++){
            if(items[i]!=null && items[i] instanceof Dish)
                System.out.println(" " + items[i].getName() + " " + items[i].getCost() + " " + items[i].getDescription());
            else if(items[i]!=null && items[i] instanceof Drink)
                System.out.println(" " + items[i].getName() + " " + items[i].getCost() + " " + items[i].getDescription() + " " + ((Drink) items[i]).getAlcoholVol() + " " + ((Drink) items[i]).getType());
        }
    }
    //lab_33 file
//    public static void main(String[] args) throws FileNotFoundException {
//        TableOrdersManager tableOrdersManager = new TableOrdersManager(10);
//        Order order = new TableOrder(5);
//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("D:/lab_33.txt"))) {
//            String line = bufferedReader.readLine();
//            while (line != null) {
//                String value[] = line.split(" ");
//                int cost = Integer.parseInt(value[0]);
//                String name = value[1];
//                String description = value[2];
//                if (value.length > 3) {
//                    double alcoholVol = Double.parseDouble(value[3]);
//                    DrinkTypeEnum type = DrinkTypeEnum.valueOf(value[4]);
//                    order.add(new Drink(cost, name, description, alcoholVol, type));
//                } else {
//                    order.add(new Dish(cost, name, description));
//                }
//                line = bufferedReader.readLine();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        tableOrdersManager.add(order,1);
//        MenuItem[] items = tableOrdersManager.getOrder(1).getItems();
//        for (int i = 0; i < items.length; i++) {
//            if (items[i] != null && items[i] instanceof Dish)
//                System.out.println(" " + items[i].getName() + " " + items[i].getCost() + " " + items[i].getDescription());
//            else if (items[i] != null && items[i] instanceof Drink)
//                System.out.println(" " + items[i].getName() + " " + items[i].getCost() + " " + items[i].getDescription() + " " + ((Drink) items[i]).getAlcoholVol() + " " + ((Drink) items[i]).getType());
//        }
//    }
}
