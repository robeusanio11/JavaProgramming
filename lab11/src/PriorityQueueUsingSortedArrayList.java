import java.util.*;

public class PriorityQueueUsingSortedArrayList<E extends Comparable<E>> {
    private ArrayList<E> list = new ArrayList<>();

    public int getSize() {
        return list.size();
    }

    // public void enqueue(E e) {
    //     int index = 0;
    //     while ((index < list.size()) && (e.compareTo(list.get(index)) > 0)) {
    //         index++;
    //     } 
    //     list.add(index, e);
    // }

    public void enqueue(E e) {        
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            E midVal = list.get(mid);

            if (e.compareTo(midVal) == 0) {
                low = mid;
                break;
            } else if (e.compareTo(midVal) > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        list.add(low, e);
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