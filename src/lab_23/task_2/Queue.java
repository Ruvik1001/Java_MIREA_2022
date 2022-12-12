package lab_23.task_2;

public interface Queue {

    public Object get(int i);
    public void enqueue(Object elem);
    public void push(Object elem);
    public Object element();
    public Object peek();
    public Object dequeue();
    public Object remove();
    public int size();
    public boolean isEmpty();
    public void clear();

}
