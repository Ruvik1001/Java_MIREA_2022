package Lab4_1.Transport;

public abstract class TransportVehicle {
    protected int speed                 = 0;
    protected int countOfPassengers     = 0;
    protected long costOnKilometre    = 0;

    //////////////////////////////////
    public TransportVehicle(int speed, int countOfPassengers, long costOnKilometre) {
        this.speed = speed;
        this.countOfPassengers = countOfPassengers;
        this.costOnKilometre = costOnKilometre;
    }
    //////////////////////////////////

    public int getSpeed() {
        return speed;
    }

    public int getCountOfPassengers() {
        return countOfPassengers;
    }

    public double getCostOnKilometre() {
        return costOnKilometre;
    }


    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setCountOfPassengers(int countOfPassengers) {
        this.countOfPassengers = countOfPassengers;
    }

    public void setCostOnKilometre(long costOnKilometre) {
        this.costOnKilometre = costOnKilometre;
    }


    public double getCountMinutes(double kilometre) {
        return getCountHours(kilometre) * 60;
    }

    public double getCountHours(double kilometre) {
        return kilometre / speed;
    }

    public double getCountDays(double kilometre) {
        return  getCountHours(kilometre) / 24;
    }

    public double getCostOfTravel(double kilometre) { return kilometre * costOnKilometre; }

    public double getCostOfTravel(double kilometre, int countOfPassengers) {
        return getCountOfVehicle(countOfPassengers) * getCostOfTravel(kilometre);
    }

    public int getCountOfVehicle(int countOfPassengers) {
        double countOfVehicle = countOfPassengers / this.countOfPassengers;
        if (countOfVehicle != (double)((int) countOfVehicle))
            countOfVehicle = Math.ceil(countOfVehicle);
        return (int)countOfVehicle;
    }
}
