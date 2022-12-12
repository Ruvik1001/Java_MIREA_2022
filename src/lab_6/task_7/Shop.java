package lab_6.task_7;

public class Shop implements Printable{
    private String name;
    private int taxCode;
    public Shop(String name, int taxCode){
        this.name = name;
        this.taxCode = taxCode;
    }
    public void print(){
        System.out.println("This shop is called " + this.name + "  and has a tax code of " + this.taxCode);
    }

}
