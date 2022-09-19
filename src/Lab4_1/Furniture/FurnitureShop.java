package Lab4_1.Furniture;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class FurnitureShop {
    private List<Furniture> products = new Vector<Furniture>();

    //////////////////////////////////
    public FurnitureShop() {}

    public FurnitureShop(Furniture... products) {
        this.products = Arrays.stream(products).toList();
    }
    //////////////////////////////////

    public List<Furniture> getProducts() {
        return products;
    }

    public void showPrice() {
        System.out.print("Price:\n");
        for (Furniture prod : products)
            System.out.println(prod.toString());
    }

    public void showPrice(String argument) {
        sortPrice(argument);
        showPrice();
    }

    public void sortPrice(String argument) {
        if (argument.toLowerCase().equals("type")) products.sort((p1, p2) -> p1.getType().compareTo(p2.getType()));
        else if (argument.toLowerCase().equals("color")) products.sort((p1, p2) -> p1.getColor().compareTo(p2.getColor()));
        else if (argument.toLowerCase().equals("cost"))
            products.sort((Furniture p1, Furniture p2) -> {
                if (p1.getCost() < p2.getCost())
                    return -1;
                else if (p1.equals(p2))
                    return 0;
                else
                    return 1;
            });
    }

    public void add(Furniture... products) {
        this.products.addAll(Arrays.stream(products).toList());
    }

    public void sell(Furniture... products) {
       for (Furniture prod : products) {
           boolean ok = false;
           for (int i = 0; i < this.products.size(); i++) {
               if (prod.equals(this.products.get(i))) {
                   System.out.print(prod + " was soled.\n");
                   this.products.remove(i);
                   ok = true;
                   break;
               }
           }
           if (!ok)
               System.out.print("Can't sold: " + prod);
       }
    }

    public void getInfoAbout(Furniture... products) {
        for (Furniture prod : products)
            prod.inOperation();
    }
}
