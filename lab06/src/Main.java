/*  Question 1: 
public class Main {
    public static void main(String[] args) {
        System.out.println(count("Hello World", 'x'));
        System.out.println(count("Hello World", 'l'));
        System.out.println(count("Robert Eusanio", 'o'));
    }
    
    public static int count(String str, char a) {
        int total = 0;
        if (str.indexOf(a) == -1) {
            return total;
        } else {
            total++;
            return total + count(str.substring(str.indexOf(a)+1), a);
        }
    }
}
*/
/* QUESTION 1:
(Occurrences of a specified character in a string) Write a recursive method that
finds the number of occurrences of a specified letter in a string using the following method header:
public static int count(String str, char a)
 For example, count("Welcome", 'e') returns 2. Write a test program that
prompts the user to enter a string and a character, and displays the number of
occurrences for the character in the string.
*/
public class Main {
    public static void main(String[] args) {
    
    }
}
/* QUESTION 2:
(Find the largest number in an array) Write a recursive method that returns the
largest integer in an array. Write a test program that prompts the user to enter a
list of eight integers and displays the largest element.
*/