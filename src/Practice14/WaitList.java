package Practice14;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList {
    /**
     *
     */
    protected ConcurrentLinkedQueue<E> content;
    public WaitList() {
        content = new ConcurrentLinkedQueue<>();
    }
    public WaitList(Collection<E> c) {
        content = new ConcurrentLinkedQueue<>(c);
    }
    @Override
    public void add(Object element) {
        content.add((E)element);
    }

    @Override
    public Object remove() {
        return content.poll();
    }

    @Override
    public boolean contains(Object element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(Collection c) {
        return content.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < content.size(); i++) {
            result += content.peek().toString() + " ";
            content.add(content.poll());
        }
        return result;
    }
}
// content.toString()