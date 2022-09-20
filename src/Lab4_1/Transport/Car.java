package Lab4_1.Transport;

public class Car extends TransportVehicle {
    public Car(int speed, int countOfPassengers) {
        super(speed, countOfPassengers, (long)((1 + countOfPassengers / 5) * 3.7 * 50 / 100));
    }
}
