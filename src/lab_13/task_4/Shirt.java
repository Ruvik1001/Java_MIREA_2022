package lab_13.task_4;

public class Shirt {
    private String code;
    private String type;
    private String color;
    private String size;
    public Shirt(String str){
        String[] arr =  str.split(",");
        this.code = arr[0];
        this.type = arr[1];
        this.color = arr[2];
        this.size = arr[3];
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "code='" + code + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    public static void main(String[] args) {
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        for (String s : shirts)
        {
            Shirt shirt = new Shirt(s);
            System.out.println(shirt);
        }
    }
}
