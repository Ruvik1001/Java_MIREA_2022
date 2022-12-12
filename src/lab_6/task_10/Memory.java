package lab_6.task_10;

public class Memory {
    private int RAM;
    private int ROM;

    public Memory(int RAM, int ROM){
        this.RAM = RAM;
        this.ROM = ROM;
    }

    public int getRAM() {
        return RAM;
    }

    public int getROM() {
        return ROM;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "RAM=" + RAM +
                ", ROM=" + ROM +
                '}';
    }
}
