package Practice21;

public class ArrayQueueADT<T> {
    private int size;
    private int usedcount;
    Object[] objects;
    ArrayQueueADT(int size) {
        this.size = size;
        this.usedcount = 0;
        this.objects = new Object[size];
    }
    public void enqueue(T t) {
        int i = 0;
        while (this.objects[i] != null) {
            i++;
        }
        this.objects[i] = t;
        this.usedcount++;
    }
    public T element() {
        return (T)this.objects[0];
    }
    public T dequeue() {
        T t = (T)this.objects[0];
        for (int i = 0; i < this.usedcount - 1; i++) {
            this.objects[i] = this.objects[i+1];
        }
        this.objects[this.usedcount-1] = null;
        this.usedcount--;
        return t;
    }
    public int size() {
        return this.usedcount;
    }
    public boolean isEmpty() {
        if (this.usedcount == 0) {
            return true;
        }
        return false;
    }
    public void clear() {
        int i = 0;
        while (this.objects[i] != null) {
            this.objects[i] = null;
            i++;
        }
        this.usedcount = 0;
    }

    @Override
    public String toString() {
        String result = "[ ";
        for (int i = 0; i < this.usedcount; i++) {
            result += this.objects[i] + " ";
        }
        result += "]";
        return result;
    }

    public static void main(String[] args) {
        ArrayQueueADT<Integer> queue = new ArrayQueueADT<>(5);
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
