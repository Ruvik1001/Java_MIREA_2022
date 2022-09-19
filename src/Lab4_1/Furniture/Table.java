package Lab4_1.Furniture;

public class Table extends Furniture {
    protected boolean placeForPC = false;

    //////////////////////////////////
    public Table() {
        type = "Table";
    }

    public Table(boolean placeForPC) {
        type = "Table";
        this.placeForPC = placeForPC;
    }

    public Table(String color) {
        super(color, "Table");
    }

    public Table(String color, boolean placeForPC) {
        super(color, "Table");
        this.placeForPC = placeForPC;
    }

    public Table(String color, int cost) {
        super(color, "Table", cost);
    }

    public Table(String color, int cost, boolean placeForPC) {
        super(color, "Table", cost);
        this.placeForPC = placeForPC;
    }
    //////////////////////////////////

    @Override
    public void inOperation() {
        System.out.print(type + " say: " + "They're writing for me...\n");
    }

    public boolean isPlaceForPC() {
        return placeForPC;
    }

    public void setPlaceForPC(boolean placeForPC) {
        this.placeForPC = placeForPC;
    }

    @Override
    public String toString() {
        return "Table{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", placeForPC=" + placeForPC +
                ", cost=" + cost +
                '}';
    }
}
