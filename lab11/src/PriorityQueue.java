import java.util.Comparator;

public class PriorityQueue<E> {
    private Comparator<? super E> comparator;

    public PriorityQueue() {
        this.comparator = (Comparator<E>) (a, b) -> a.hashCode() - b.hashCode();
    }
    public PriorityQueue(Comparator<? super E> comparator) {
        this.comparator = comparator;
    }
    
}
