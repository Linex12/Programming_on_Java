package Practice21;

import java.util.ArrayList;
import java.util.List;

public class ArrayQueue<T> extends AbstractQueue<T> {
    private int size;
    private int usedcount;
    Object[] objects;
    ArrayQueue(int size) {
        this.size = size;
        usedcount = 0;
        objects = new Object[size];
    }
    public void enqueue(T t) {
        int i = 0;
        while (objects[i] != null) {
            i++;
        }
        objects[i] = t;
        usedcount++;
    }
    public T element() {
        return (T)objects[0];
    }
    public T dequeue() {
        T t = (T)objects[0];
        for (int i = 0; i < usedcount - 1; i++) {
            objects[i] = objects[i+1];
        }
        objects[usedcount-1] = null;
        usedcount--;
        return t;
    }
    public int size() {
        return usedcount;
    }
    public boolean isEmpty() {
        if (usedcount == 0) {
            return true;
        }
        return false;
    }
    public void clear() {
        int i = 0;
        while (objects[i] != null) {
            objects[i] = null;
            i++;
        }
        usedcount = 0;
    }

    @Override
    public String toString() {
        String result = "[ ";
        for (int i = 0; i < usedcount; i++) {
            result += objects[i] + " ";
        }
        result += "]";
        return result;
    }

    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<>(5);
        queue.enqueue(3);
        queue.enqueue(6);
        queue.enqueue(5);
        queue.enqueue(2);
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.element());
        System.out.println(queue);
    }
}
