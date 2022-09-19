package Lab4_1.Furniture;

import java.util.Arrays;

public class Main {
    public static void main(String... args) {
        System.out.print(
                "Create FurnitureShop and add some different furniture in it.\n\n");

        FurnitureShop fs = new FurnitureShop();
        Furniture[] prod = {
                new Chair("GamingRed", 17500, 210),
                new Table("Green", 13000, false),
                new Chair("Black", 3500),
                new Table("GamingBlue", 24000, true)
        };

        fs.add(prod);
        fs.showPrice();

        System.out.print("\nTry sort from type.\n");
        fs.showPrice("type");
        System.out.print("\nTry sort from color.\n");
        fs.showPrice("color");
        System.out.print("\nTry sort from cost.\n");
        fs.showPrice("cost");

        System.out.print("\nTry get some info about different furniture:\n");
        fs.getInfoAbout(Arrays.copyOf(fs.getProducts().toArray(new Furniture[0]), 2));

        System.out.print("\nTry sell some.\n");
        fs.sell(prod[0]);
        System.out.print("\nTry one more.\n");
        fs.sell(prod[0]);


    }
}
