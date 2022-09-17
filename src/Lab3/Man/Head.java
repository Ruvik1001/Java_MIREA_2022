package Lab3.Man;

public class Head {
    private String hairColor = "Black";
    private String eyesColor = "Blue";

    //////////////////////////////////
    public Head() {}

    public Head(String hairColor, String eyesColor) {
        this.hairColor = hairColor;
        this.eyesColor = eyesColor;
    }
    //////////////////////////////////

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void say(String what) {
        System.out.print(what + '\n');
    }

    @Override
    public String toString() {
        return "Head{" +
                "hairColor='" + hairColor + '\'' +
                ", eyesColor='" + eyesColor + '\'' +
                '}';
    }
}
