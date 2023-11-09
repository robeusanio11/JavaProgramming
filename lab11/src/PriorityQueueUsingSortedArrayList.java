import java.util.*;

public class PriorityQueueUsingSortedArrayList<E extends Comparable<E>> {
    private ArrayList<E> list = new ArrayList<>();

    public int getSize() {
        return list.size();
    }

    public void enqueue(E e) {
        list.add(e);
        Collections.sort(list);
    }

    public E dequeue() {
        if (isEmpty()) {
            return null;
        }
        return list.remove(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}