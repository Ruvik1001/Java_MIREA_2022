package lab_29;

public class Dish extends MenuItem implements Item{

    public Dish(int cost, String name, String description){
        super(cost,name,description);
        if(cost < 0 || name == null || description == null) throw new IllegalArgumentException();
    }
}
