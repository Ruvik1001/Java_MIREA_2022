package Lab4_1.Furniture;

public abstract class Furniture {
    protected String color  = "Gray";
    protected String type   = "Table";
    protected int cost = 1000;

    //////////////////////////////////
    public Furniture() {}

    public Furniture(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public Furniture(String color, String type, int cost) {
        this.color = color;
        this.type = type;
        this.cost = cost;
    }
    //////////////////////////////////

    public abstract void inOperation();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                '}';
    }

}
