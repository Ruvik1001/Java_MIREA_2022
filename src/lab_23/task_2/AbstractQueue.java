package lab_23.task_2;

public abstract class AbstractQueue implements Queue {
    // inv: size >= 0
    protected int size = 0;

    protected abstract Object get_(int i);

    protected abstract void enqueue_(Object elem);

    protected abstract void push_(Object elem);

    protected abstract Object element_();

    protected abstract Object peek_();

    protected abstract void dequeue_();

    protected abstract void remove_();

    public Object get(int i) {
        assert 0 <= i && i < size;
        return get_(i);
    }
    public void enqueue(Object elem) {
        enqueue_(elem);
        size++;
    }
    public void push(Object elem) {
        push_(elem);
        size++;
    }
    public Object element() {
        assert size > 0;
        return element_();
    }

    // pre: size > 0
    // post: R = queue[size - 1]
    public Object peek() {
        assert size > 0;
        return peek_();
    }

    public Object dequeue() {
        assert size > 0;
        Object r = element_();
        dequeue_();
        size--;
        return r;
    }

    public Object remove() {
        assert size > 0;
        Object r = peek_();
        remove_();
        size--;
        return r;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        while (!isEmpty()) {
            dequeue();
        }
    }
}
