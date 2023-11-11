public class Main {
    public static void main(String[] args) {
        PriorityQueueUsingSortedArrayList<Integer> pq1 = new PriorityQueueUsingSortedArrayList<>();
        MyPriorityQueue<Integer> pq2 = new MyPriorityQueue<>();

        long pq2Start = System.currentTimeMillis();
        for (int i=0; i<5000000; i++) {
            pq2.enqueue((int) Math.random()*100);
        }
        System.out.print("enqueued");
        while (pq2.getSize() > 0) {
            pq2.dequeue();
        }
        long pq2End = System.currentTimeMillis();
        System.out.print("Total time pq1: " + (pq2End-pq2Start));
    }
}
/* #24.6
(Revise MyPriorityQueue) Listing 24.8, uses a heap to implement the priority
queue. Revise the implementation using a sorted array list to store the elements and
name the new class PriorityQueueUsingSortedArrayList. The elements
in the array list are sorted in increasing order of their priority with the last element
having the highest priority. Write a test program that generates 5 million integers
and enqueues to the priority and dequeues from the queue. Use the same
numbers for MyPriorityQueue and PriorityQueueUsingSortedArrayList
and display their execution times.
 */