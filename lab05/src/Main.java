/* QUESTION 1:
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 side lengths:");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();
        System.out.print("Enter color: ");
        String color = input.next();
        System.out.print("Is Triangle Filled? (true/false): ");
        boolean filled = input.nextBoolean();
        Triangle tri = new Triangle(s1, s2, s3);
        tri.setColor(color);
        tri.setFilled(filled);
        tri.printInfo();
    }
}
(Triangle class) Design a new Triangle class that extends the abstract
GeometricObject class. Draw the UML diagram for the classes Triangle
and GeometricObject and then implement the Triangle class. Write a test
program that prompts the user to enter three sides of the triangle, a color, and a
Boolean value to indicate whether the triangle is filled. The program should create
a Triangle object with these sides and set the color and filled properties using
the input. The program should display the area, perimeter, color, and true or false
to indicate whether it is filled or not.
*/
public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(1, "yellow", true);
        Circle c2 = new Circle(5, "yellow", true);
        Circle c3 = new Circle(5, "green", false);
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c2.equals(c3));
    }
}

/*


(Enable Circle comparable) Rewrite the Circle class in Listing 13.2 to extend
GeometricObject and implement the Comparable interface. Override the
equals method in the Object class. Two Circle objects are equal if their radii
are the same. Draw the UML diagram that involves Circle, GeometricObject,
and Comparable
*/