package lab_6.task_10;

public class Processor {
    private double clockSpeed;
    private int core;
    private int threads;

    public Processor(double clockSpeed, int core, int threads){
        this.clockSpeed = clockSpeed;
        this.core = core;
        this.threads = threads;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }

    public int getCore() {
        return core;
    }

    public int getThreads() {
        return threads;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "clockSpeed=" + clockSpeed +
                ", core=" + core +
                ", threads=" + threads +
                '}';
    }
}
