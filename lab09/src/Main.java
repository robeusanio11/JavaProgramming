import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of objects: ");
        final int SIZE = input.nextInt();
        List<Integer> numList = new ArrayList<Integer>(SIZE);
        System.out.println("Enter the weights of the objects: ");
        for (int i = 0; i < SIZE; i++) {
            numList.add(input.nextInt());
        }
        Collections.sort(numList, Collections.reverseOrder());
        List<List<Integer>> containers = new ArrayList<>();
        for(int num : numList) {
            boolean placed = false;
            for (List<Integer> container : containers) {
                int totalWeight = 0;
                for (int weight : container) {
                    totalWeight += weight;
                }
                if (totalWeight+num <= 10) {
                    container.add(num);
                    placed = true;
                    break;
                }
            }
            if (!placed) {
                List<Integer> newContainer = new ArrayList<>();
                newContainer.add(num);
                containers.add(newContainer);
            }
        }

    }


    // public static int packObjects(List<Integer> objects, int index, List<Integer> bins) {
    //     if (index == objects.size()) {
    //         return bins.size(); // All objects are packed, return the number of bins used
    //     }

    //     int object = objects.get(index);

    //     // Try to place the object in existing bins
    //     for (int i = 0; i < bins.size(); i++) {
    //         if (bins.get(i) + object <= 10) {
    //             bins.set(i, bins.get(i) + object);
    //             int result = packObjects(objects, index + 1, bins);
    //             bins.set(i, bins.get(i) - object); // Backtrack
    //             return result;
    //         }
    //     }

    //     // If the object doesn't fit in existing bins, create a new bin
    //     bins.add(object);
    //     int result = packObjects(objects, index + 1, bins);
    //     bins.remove(bins.size() - 1); // Backtrack
    //     return result;
    // }

    // public static int findMinContainers(List<Integer> objects) {
    //     List<Integer> bins = new ArrayList<>();
    //     return packObjects(objects, 0, bins);
    // }

    // public static void main(String[] args) {
    //     List<Integer> objects = List.of(7, 5, 2, 3, 5, 8);
    //     int minContainers = findMinContainers(objects);
    //     System.out.println("Minimum number of containers needed: " + minContainers);
    // }
}

/* #22.6 (Bin packing with smallest object) The bin packing problem is to pack the
objects of various weights into containers. Assume each container can hold a
maximum of 10 pounds. The program uses an algorithm that places an object with 
the smallest weight into the first bin in which it would fit. Your program should 
prompt the user to enter the total number of objects and the weight of each object.
The program displays the total number of containers needed to pack the obects, 
and the contents of each container. Here is a sample run of the program:

Enter the number of objects: 6
Enter the weights of the objects: 7 5 2 3 5 8
Container 1 contains objects with weight 2 3 5
Container 2 contains objects with weight 5
Container 3 contains objects with weight 7
Container 4 contains objects with weight 8

Does this program produce an optimal solution, that is, finding the minimum 
number of containers to pack the objects?
 * 
 */