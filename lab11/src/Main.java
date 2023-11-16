/* #24.6
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PriorityQueueUsingSortedArrayList<Integer> pq1 = new PriorityQueueUsingSortedArrayList<>();
        MyPriorityQueue<Integer> pq2 = new MyPriorityQueue<>();
        ArrayList<Integer> numList = new ArrayList<>();

        for (int i=0; i<500000; i++) {
            int rand = (int) (Math.random()*100);
            numList.add(rand);
        }

        long pq1Start = System.currentTimeMillis();
        for (int i=0; i<numList.size(); i++) {
            pq1.enqueue(numList.get(i));
        }
        while (pq1.getSize() > 0) {
            pq1.dequeue();
        }
        long pq1End = System.currentTimeMillis();
        System.out.println("Total time Priority Queue 1(ArrayList): " + (pq1End-pq1Start));
        
        long pq2Start = System.currentTimeMillis();
        for (int i=0; i<numList.size(); i++) {
            pq2.enqueue(numList.get(i));
        }
        while (pq2.getSize() > 0) {
            pq2.dequeue();
        }
        long pq2End = System.currentTimeMillis();
        System.out.println("Total time Priority Queue 2(Heap): " + (pq2End-pq2Start));
    }
}

(Revise MyPriorityQueue) Listing 24.8, uses a heap to implement the priority
queue. Revise the implementation using a sorted array list to store the elements and
name the new class PriorityQueueUsingSortedArrayList. The elements
in the array list are sorted in increasing order of their priority with the last element
having the highest priority. Write a test program that generates 5 million integers
and enqueues to the priority and dequeues from the queue. Use the same
numbers for MyPriorityQueue and PriorityQueueUsingSortedArrayList
and display their execution times.
 */