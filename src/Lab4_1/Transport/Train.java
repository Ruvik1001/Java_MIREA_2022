package Lab4_1.Transport;

public class Train extends TransportVehicle {
    public Train(int speed, int countOfPassengers) {
        super(speed, countOfPassengers, (long)((countOfPassengers / 750) * 250 * 45 / 100));
    }
}
