package Lab3.Man;

public class Human {
    private Head head = new Head();
    private Hand hand = new Hand();
    private Leg leg = new Leg();
    private String name = "John";
    private int age = 10;

    //////////////////////////////////
    public Human() {}

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name, int age, String hairColor, String eyesColor) {
        this.name = name;
        this.age = age;
        head.setHairColor(hairColor);
        head.setEyesColor(eyesColor);
    }

    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}
    public String getName() {return name;}
    public int getAge() {return age;}

    public void setHairColor(String hairColor) {head.setHairColor(hairColor);}
    public void setEyesColor(String eyesColor) {head.setEyesColor(eyesColor);}
    public String getEyesColor() {return head.getEyesColor();}
    public String getHairColor() {return head.getHairColor();}
    public void say(String what) {head.say(what);}

    public void welcome() {hand.welcome();}
    public void shakeHands() {hand.shakeHands();}
    public void hit() {hand.hit();}

    public void go() {leg.go();}
    public void stand() {leg.stand();}
    public void sit() {leg.sit();}
    public void run() {leg.run();}

    @Override
    public String toString() {
        return "Human{" +
                "head=" + head.toString() +
                ", hand=" + "only methods" +
                ", leg=" + "only methods" +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
