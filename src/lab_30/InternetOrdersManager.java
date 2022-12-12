package lab_30;

import java.util.NoSuchElementException;

public class InternetOrdersManager {
    private Node first;
    private Node last;
    private int size;

    public void clear() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

//    public void display(){
//        System.out.println(this.first.order.getName() + " " + this.first.order.getCost() + " " + this.first.order.getDescription());
//        for (Node node = this.first.next; node != this.first; node = node.next) {
//            System.out.println(node.order.getName() + " " + node.order.getCost() + " " + node.order.getDescription());
//        }
//    }
    public void addFirst(Order order) {
        if (order != null) {
            if (this.first == null) {
                this.first = new Node(order);
                this.first.prev = this.first.next = this.first;
                this.last = this.first;
            } else {
                Node node = new Node(this.first, this.last, order);
                this.last.next = this.first.prev = node;
                this.first = node;
            }
            this.size++;
        }
    }
    public void addLast(Order order) {
        if (order != null) {
            if (this.first == null) {
                addFirst(order);
            } else {
                Node node = new Node(this.first, this.last, order);
                this.first.prev = this.last.next = node;
                this.last = node;
                this.size++;
            }
        }
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public Order removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("Element not found...");
        }
        Order oldElement;
        if (this.size == 1) {
            oldElement = this.first.order;
            clear();
        } else {
            oldElement = this.first.order;
            Node newFirst = this.first.next;
            newFirst.prev = this.last;
            this.last.next = newFirst;
            this.first = newFirst;
            this.size--;
        }
        return oldElement;
    }

    public Order remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("Element not found...");
        }
        Order oldElement;
        if (this.size == 1) {
            oldElement = this.first.order;
            clear();
        } else {
            oldElement = this.last.order;
            Node newLast = this.last.prev;
            newLast.next = this.first;
            this.first.prev = newLast;
            this.last = newLast;
            this.size--;
        }
        return oldElement;
    }

    public boolean add(Order order) {
        addLast(order);
        return true;
    }
    private class Node {
        private Node next;
        private Node prev;
        private Order order;

        Node(Node next, Node prev, Order order) {
            this.next = next;
            this.prev = prev;
            this.order = order;
        }

        Node(Order order) {
            this(null, null, order);
        }
    }
}
