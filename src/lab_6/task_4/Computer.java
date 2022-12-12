package lab_6.task_4;

public class Computer implements Priceable {
    private double price;
    private int RAM;
    private String CPU;
    private int HDD;

    Computer(int RAM, String CPU, int HDD, double price) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setHDD(int HDD) {
        this.HDD = HDD;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getHDD() {
        return HDD;
    }

    public int getRAM() {
        return RAM;
    }

    public String getCPU() {
        return CPU;
    }

    @Override
    public void getPrice() {
        System.out.println("This computer have " + this.CPU + " and " + this.RAM + "gb RAM " + this.HDD + "gb HDD, priced at "+ this.price);
    }
}