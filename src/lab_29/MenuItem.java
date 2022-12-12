package lab_29;

public class MenuItem implements Item {
    private int cost;
    private String name;
    private String description;
    public MenuItem(int cost, String name, String description)
    {
        if(cost < 0 || name == null || description == null) throw new IllegalArgumentException();
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
