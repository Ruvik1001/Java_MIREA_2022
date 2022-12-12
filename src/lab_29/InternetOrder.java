package lab_29;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class InternetOrder implements  Cloneable, Order{

    private Node first;
    private Node last;
    private int size;

    public void clear() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public void display(){
        System.out.println(this.first.item.getName() + " " + this.first.item.getCost() + " " + this.first.item.getDescription());
        for (Node node = this.first.next; node != this.first; node = node.next) {
           System.out.println(node.item.getName() + " " + node.item.getCost() + " " + node.item.getDescription());
        }
    }
    public void addFirst(MenuItem item) {
        if (item != null) {
            if (this.first == null) {
                this.first = new Node(item);
                this.first.prev = this.first.next = this.first;
                this.last = this.first;
            } else {
                Node node = new Node(this.first, this.last, item);
                this.last.next = this.first.prev = node;
                this.first = node;
            }
            this.size++;
        }
    }
    public void addLast(MenuItem item) {
        if (item != null) {
            if (this.first == null) {
                addFirst(item);
            } else {
                Node node = new Node(this.first, this.last, item);
                this.first.prev = this.last.next = node;
                this.last = node;
                this.size++;
            }
        }
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public MenuItem removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("Element not found...");
        }
        MenuItem oldElement;
        if (this.size == 1) {
            oldElement = this.first.item;
            clear();
        } else {
            oldElement = this.first.item;
            Node newFirst = this.first.next;
            newFirst.prev = this.last;
            this.last.next = newFirst;
            this.first = newFirst;
            this.size--;
        }
        return oldElement;
    }

    public MenuItem removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("Element not found...");
        }
        MenuItem oldElement;
        if (this.size == 1) {
            oldElement = this.first.item;
            clear();
        } else {
            oldElement = this.last.item;
            Node newLast = this.last.prev;
            newLast.next = this.first;
            this.first.prev = newLast;
            this.last = newLast;
            this.size--;
        }
        return oldElement;
    }

    @Override
    public boolean add(MenuItem item) {
        addLast(item);
        return true;
    }

    @Override
    public boolean remove(String itemName) {
        boolean result;
        if (result = itemName != null) {
            if (result = !isEmpty()) {
                if (result = this.first.item.getName().equals(itemName)) {
                    removeFirst();
                } else {
                    Node delete = null;
                    for (Node node = this.first.next; node != this.first; node = node.next) {
                        if (node.item.getName().equals(itemName)) {
                            delete = node;
                        }
                    }
                    if (result = delete != null) {
                        if (delete == this.last) {
                            removeLast();
                        } else {
                            delete.prev.next = delete.next;
                            delete.next.prev = delete.prev;
                            this.size--;
                        }
                    }
                }
            }
        }
        return result;
    }

    @Override
    public int removeAll(String itemName) {
        int result = 0;
        if(isEmpty()) return result;
        if(this.first.item.getName().equals(itemName)){
            removeFirst(); result++;
        }
        else {
            for (Node node = this.first.next; node != this.first; node = node.next) {
                if (node.item.getName().equals(itemName)) {
                    if (node != null) {
                        if (node == this.last) {
                            removeLast();
                        } else {
                            node.prev.next = node.next;
                            node.next.prev = node.prev;
                            this.size--;
                        }
                        // lui
                    }
                }
            }
        }
        return result;
    }

    @Override
    public int removeAll(MenuItem item) {
        int result = 0;
        if(isEmpty()) return result;
        if(this.first.item.equals(item)){
            removeFirst(); result++;
        }
        else {
            for (Node node = this.first.next; node != this.first; node = node.next) {
                if (node.item.equals(item)) {
                    if (node != null) {
                        if (node == this.last) {
                            removeLast();
                        } else {
                            node.prev.next = node.next;
                            node.next.prev = node.prev;
                            this.size--;
                        }
                        // lui
                    }
                }
            }
        }
        return result;
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        MenuItem[] menuItems = new MenuItem[size];
        int i = 0;
        menuItems[0] = this.first.item;
        for (Node node = this.first.next; node != this.first; node = node.next){
            menuItems[++i] = node.item;
        }
        Arrays.sort(menuItems);
        return menuItems;
    }

    @Override
    public int costTotal() {
        int result = 0;
        result += this.first.item.getCost();
        for (Node node = this.first.next; node != this.first; node = node.next){
           result += node.item.getCost();
        }
        return result;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String[] nameOfItems() {
        String[] name = new String[size];
        int i = 0;
        name[0] = this.first.item.getName();
        for (Node node = this.first.next; node != this.first; node = node.next){
            name[++i] = node.item.getName();
        }
        return name;
    }


    private class Node {
        private Node next;
        private Node prev;
        private MenuItem item;

        Node(Node next, Node prev, MenuItem item) {
            this.next = next;
            this.prev = prev;
            this.item = item;
        }

        Node(MenuItem item) {
            this(null, null, item);
        }
    }
}
