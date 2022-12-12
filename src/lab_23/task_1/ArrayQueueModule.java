package lab_23.task_1;

public class ArrayQueueModule {
    private static final int MINIMAL_CAPACITY = 16;
    private static Object[] array;
    private static int capacity, size, head, tail;

    public ArrayQueueModule() {
        size = head = tail = 0;
        capacity = MINIMAL_CAPACITY;
        array = new Object[MINIMAL_CAPACITY];
    }
    private static void resize(int newCapacity) {
        Object[] old_queue = array;
        array = new Object[newCapacity];
        capacity = newCapacity;
        if (size > 0) {
            if (head >= tail) {
                System.arraycopy(old_queue, head, array, 0, size - tail);
                System.arraycopy(old_queue, 0, array, size - tail, tail);

            } else {
                System.arraycopy(old_queue, head, array, 0, size);
            }
        }
        head = 0;
        tail = size;
    }

    public static void enqueue(Object elem) {
        if (size == capacity) {
            resize(capacity * 2);
        }
        array[tail] = elem;
        tail = (tail + 1) % capacity;
        size++;
    }
    public static void push(Object elem) {
        if (size == capacity) {
            resize(capacity * 2);
        }
        head--;
        if (head < 0) {
            head = capacity - 1;
        }
        array[head] = elem;
        size++;
    }
    public static Object element() {
        assert size > 0;
        return array[head];
    }
    public static Object peek() {
        assert size > 0;
        return array[tail == 0 ? capacity - 1 : tail - 1];
    }
    public static Object dequeue() {
        assert size > 0;
        Object r = element();
        head = (head + 1) % capacity;
        size--;
        return r;
    }
    public static int size() {
        return size;
    }
    public static boolean isEmpty() {
        return size == 0;
    }
    public static void clear() {
        size = 0;
        head = 0;
        tail = 0;
    }

    public static void display() {
        for (int i = 0; i < size();i++)
        {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        ArrayQueueModule queue = new ArrayQueueModule();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.print("Queue: ");
        display();
        dequeue();
        System.out.print("\nQueue: ");
        display();
    }

}
