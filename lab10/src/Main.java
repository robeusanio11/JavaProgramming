import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[] list2 = {-44, -5, -3, 3, 3, 1, -4, 0, 1, 2, 4, 5, 53};
        heapSort(list2, (o1, o2) -> o1 - o2);
        System.out.println(Arrays.toString(list2));
    }

    public static <E> void heapSort(E[] list, Comparator<? super E> comparator)
    {
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