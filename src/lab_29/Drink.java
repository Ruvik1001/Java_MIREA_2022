package lab_29;

public class Drink extends MenuItem implements Item { //Immutable class

    public Drink(int cost, String name, String description){
        super(cost, name, description);
        if(cost < 0 || name == null || description == null) throw new IllegalArgumentException();
    }
}
