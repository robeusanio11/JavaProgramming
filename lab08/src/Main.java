import java.util.LinkedHashSet;

public class Main {
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
    }
}

/* QUESTION 1
(Perform set operations on hash sets) Create two linked hash sets {"George",
"Jim", "John", "Blake", "Kevin", "Michael"} and {"George", "Katie",
"Kevin", "Michelle", "Ryan"} and find their union, difference, and intersection. (You can clone the sets to preserve the original sets from being changed by
these set methods.)
 */
/* QUESTION 2

import java.util.LinkedHashSet;
public class Main {
    public static void main(String[] args) {
    }   
}
(Count the occurrences of numbers entered) Write a program that reads an
unspecified number of integers and finds the one that has the most occurrences.
The input ends when the input is 0. For example, if you entered 2 3 40 3 5 4 –3
3320, the number 3 occurred most often. If not one but several numbers have
the most occurrences, all of them should be reported. For example, since 9 and 3
appear twice in the list 9 30 3 9 3 2 4, both occurrences should be reported
 */