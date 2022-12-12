package lab_6.task_10;


public class Monitor {
    private int hertz;
    private int size;
    private String panel;

    public Monitor( int hertz, int size, String panel){
        this.hertz = hertz;
        this.size = size;
        this.panel = panel;
    }

    public int getHertz() {
        return hertz;
    }

    public int getSize() {
        return size;
    }

    public String getPanel() {
        return panel;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "hertz=" + hertz +
                ", size=" + size +
                ", panel='" + panel + '\'' +
                '}';
    }
}
