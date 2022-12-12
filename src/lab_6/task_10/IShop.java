package lab_6.task_10;

public interface IShop {
    Computer searchComputer(String name, int RAM, int ROM, int hz, int size, String panel, double clockSpeed, int core, int threads);
    void delComputer(String name);
    int addComputer(String name, int RAM, int ROM, int hz, int size, String panel, double clockSpeed, int core, int threads);
}
