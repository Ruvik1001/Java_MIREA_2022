package Lab4_1.Furniture;

public class Chair extends Furniture {
    protected int maxWeight = 150;

    //////////////////////////////////
    public Chair() {
        type = "Chair";
    }

    public Chair(int maxWeight) {
        type = "Chair";
        this.maxWeight = maxWeight;
    }

    public Chair(String color) {
        super(color, "Chair");
    }

    public Chair(String color, int cost) {
        super(color, "Chair", cost);
    }

    public Chair(String color, int cost, int maxWeight) {
        super(color, "Chair", cost);
        this.maxWeight = maxWeight;
    }
    //////////////////////////////////

    @Override
    public void inOperation() {
        System.out.print(type + " say: " + "They're sitting on me...\n");
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", maxWeight=" + maxWeight +
                ", cost=" + cost +
                '}';
    }
}
