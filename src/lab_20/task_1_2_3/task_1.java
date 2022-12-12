package lab_20.task_1_2_3;

public class task_1<T extends String, V extends Animal, K extends Number> {
    private T type;
    private V value;
    private K key;

    public task_1(T type, V value, K key) {
        this.type = type;
        this.value = value;
        this.key = key;
    }

    public K getKey() {
        return key;
    }

    public T getType() {
        return type;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "task_1{" +
                "type=" + type +
                ", value=" + value +
                ", key=" + key +
                '}';
    }

    public static void main(String[] args) {
        task_1<String,Animal,Integer> task = new task_1<>("Cat",new Cat(),15);
        System.out.println(task);
    }
}
