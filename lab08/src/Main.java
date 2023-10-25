/* QUESTION 1
import java.util.*;
class Main {
  public static void main(String[] args) {
    LinkedHashSet<String> hs1 = new LinkedHashSet<>();
    hs1.add("George");
    hs1.add("Jim");
    hs1.add("Blake");
    hs1.add("Kevin");
    hs1.add("Michael");
    LinkedHashSet<String> hs2 = new LinkedHashSet<>();
    hs2.add("George");
    hs2.add("Katie");
    hs2.add("Kevin");
    hs2.add("Michelle");
    hs2.add("Ryan");

    LinkedHashSet<String> hs3 = new LinkedHashSet<>(hs1);
    hs3.addAll(hs2);
    System.out.println("union: " + hs3);
    
    LinkedHashSet<String> hs4 = new LinkedHashSet<>(hs1);
    hs4.removeAll(hs2);
    System.out.println("difference: " + hs4);

    LinkedHashSet<String> hs5 = new LinkedHashSet<>(hs1);
    hs5.retainAll(hs2);
    System.out.println("intersection: " + hs5);
  }
}

(Perform set operations on hash sets) Create two linked hash sets {"George",
"Jim", "John", "Blake", "Kevin", "Michael"} and {"George", "Katie",
"Kevin", "Michelle", "Ryan"} and find their union, difference, and intersection. (You can clone the sets to preserve the original sets from being changed by
these set methods.)
 */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<Integer, Integer> numMap = new HashMap<>();
        System.out.print("Enter list of ints: ");
        int key = input.nextInt();
        while (key != 0) {
            if (numMap.containsKey(key)) {
                int freq = numMap.get(key)+1;
                numMap.put(key, freq);
            } else {
                numMap.put(key, 1);
            }
            key = input.nextInt();
        }
        Object maxVal = Collections.max(numMap.values());

        for (Map.Entry<Integer, Integer> entry : numMap.entrySet()) {
            if (maxVal == entry.getValue()) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }   
}
/* QUESTION 2
(Count the occurrences of numbers entered) Write a program that reads an
unspecified number of integers and finds the one that has the most occurrences.
The input ends when the input is 0. For example, if you entered 2 3 40 3 5 4 –3
3320, the number 3 occurred most often. If not one but several numbers have
the most occurrences, all of them should be reported. For example, since 9 and 3
appear twice in the list 9 30 3 9 3 2 4, both occurrences should be reported
 */