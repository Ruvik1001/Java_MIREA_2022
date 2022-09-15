package Lab4_1.Phones;

public class Phone {
    private String number = "+7(908)542-57-42";
    private String model = "Poco M3 Pro";
    private float weight = 0.38f;
    //////////////////////////////////
    public Phone() {}

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, float weight) {
        this(number, model);
        this.weight = weight;
    }
    //////////////////////////////////

    public void receiveCall(String number) {
        System.out.print("Incoming call from " + number + '\n');
    }

    public void receiveCall(String name, String number) {
        receiveCall('*' + name + "* " + number);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... numbers) {
        System.out.print("Msg was send:\n");
        for (String num : numbers) System.out.println(num);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
