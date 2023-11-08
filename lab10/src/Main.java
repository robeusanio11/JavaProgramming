import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[] numList1 = {1, 10, 11, 6, 3, 100, 49, 11, 20, -3};
        heapSort(numList1);
        System.out.println(Arrays.toString(numList1));

        Integer[] numList2 = {1, 10, 11, 6, 3, 100, 49, 11, 20, -3};
        heapSort(numList2, (a, b) -> a - b);
        System.out.println(Arrays.toString(numList2));
    }

    public static <E extends Comparable<E>> void heapSort(E[] list) {
        Heap<E> heap = new Heap<>();

        for (int i = 0; i < list.length; i++)
            heap.add(list[i]);

        for (int i = list.length - 1; i >= 0; i--)
            list[i] = heap.remove();
    }

    public static <E> void heapSort(E[] list, Comparator<? super E> comparator) {
        HeapUsingComparator<E> heap = new HeapUsingComparator<>(comparator);

        for (int i = 0; i < list.length; i++)
            heap.add(list[i]);

        for (int i = list.length - 1; i >= 0; i--)
            list[i] = heap.remove();
    }
}

/* #23.9 (Generic Heap using Comparator)
Revise Heap in Listing 23.9, using a generic
parameter and a Comparator for comparing objects. Define a new constructor
with a Comparator as its argument as follows:
Heap(Comparator<? super E> comparator)
 */