package lab_6.task_10;

public class Shop implements IShop {
    private Computer[] computers;
    private int top;
    private int capacity;

    public Shop(int size){
        this.capacity = size;
        top = -1;
        computers = new Computer[size];
    }
    public boolean isFull(){
        return this.top == capacity - 1;
    }
    public boolean isEmpty(){
        return this.top == -1;
    }
    public int addComputer(String name, int RAM, int ROM, int hz, int size, String panel, double clockSpeed, int core, int threads){
        if(!isFull()) {
            computers[++top] = new Computer(name, RAM, ROM, hz, size, panel, clockSpeed, core, threads);
            return 1;
        }
        return 0;
    }
    public void delComputer(String name){
        for (int i = 0; i <= top; i++)
            if(computers[i].getName() == name){
                top--;
                for (int j = i; j <= top; j++)
                    computers[j] = computers[j + 1];
            }
    }
    @Override
    public Computer searchComputer(String name, int RAM, int ROM, int hz, int size, String panel, double clockSpeed, int core, int threads){
        Computer temp = new Computer(name, RAM, ROM, hz, size, panel, clockSpeed, core, threads);
        for (int i = 0; i <= top; i++)
            if(computers[i] == temp)
                return computers[i];
        return null;
    }
    public Computer searchComputer(int Ram, int hz, double clockSpeed){
        for (int i = 0; i <= top; i++)
            if(computers[i].getMemory().getRAM() == Ram && computers[i].getMonitor().getHertz() == hz && computers[i].getProcessor().getClockSpeed() == clockSpeed)
                return computers[i];
        return null;
    }

}
