package lab_13.task_3;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String korpus;;
    private String room;;

    public Address(String format){
        String[] arrStr = format.split(", ");
        if(arrStr.length >= 2){
            this.country = arrStr[0];
            this.region = arrStr[1];
            this.city = arrStr[2];
            this.street = arrStr[3];
            this.house = arrStr[4];
            this.korpus = arrStr[5];
            this.room = arrStr[6];
        }
        else{
            StringTokenizer st = new StringTokenizer(format,"; ",false);
            this.country = st.nextToken();
            this.region = st.nextToken();
            this.city = st.nextToken();
            this.street = st.nextToken();
            this.house = st.nextToken();
            this.korpus = st.nextToken();
            this.room = st.nextToken();
        }
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", korpus='" + korpus + '\'' +
                ", room='" + room + '\'' +
                '}';
    }

    public static void main(String[] args) {
        String format = "Russia; Russia; Moskva; RTU_MIREA; 78; 4; 06-21";
        Address address = new Address(format);
        System.out.println(address);
    }

}
