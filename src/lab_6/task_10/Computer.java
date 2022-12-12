package lab_6.task_10;
public class Computer {
    private String name;
    private Memory memory;
    private Monitor monitor;
    private Processor processor;

    public Computer(String name, int RAM, int ROM, int hz, int size, String panel, double clockSpeed, int core, int threads){
        this.name = name;
        memory = new Memory(RAM,ROM);
        monitor = new Monitor(hz,size,panel);
        processor = new Processor(clockSpeed,core,threads);
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Processor getProcessor() {
        return processor;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", memory=" + memory +
                ", monitor=" + monitor +
                ", processor=" + processor +
                '}';
    }
}
