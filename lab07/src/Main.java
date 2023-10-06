/* QUESTION 1: 
class Main {
  public static void main(String[] args) {
    
    GenericStack<String> stk = new GenericStack<String>();

    stk.push("this");
    stk.push("stack");
    stk.push("has");
    stk.push("five");
    stk.push("strings");
    System.out.print(stk.toString());
  }
}
(Implement GenericStack using inheritance) In Listing 19.1, GenericStack is
implemented using composition. Define a new stack class that extends ArrayList.
Draw the UML diagram for the classes and then implement GenericStack.
Write a test program that prompts the user to enter five strings and displays them in
reverse order.
*/
import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    File file = new File(args[0]);
    Stack<Character> symbols = new Stack<>();
    boolean correct = true;
    
    try (Scanner fileText = new Scanner(file);) {      

      while (fileText.hasNext()) {
        String text = fileText.nextLine();
        for (int i  = 0; i < text.length(); i++) {
          char ch = text.charAt(i);
          if (ch == '(' || ch == '{' || ch == '[') {
            symbols.push(ch);
          } else if (ch == ')' || ch == '}' || ch == ']') {
            if ((symbols.peek() == '(' && ch == ')') || 
              (symbols.peek() == '[' && ch == ']') ||
              (symbols.peek() == '{' && ch == '}')) {
              symbols.pop();
            } else {
              correct = false;
              break;
            }
          }
      }
      }
    } catch (Exception e) {
      System.out.print(e);
    }
    if (correct) {
      System.out.print("correct pairs");
    } else {
      System.out.print("incorrect pairs");
    }
  }
}
/* QUESTION 2:
(Match grouping symbols) A Java program contains various pairs of grouping
symbols, such as:
 ■ Parentheses: ( and )
 ■ Braces: { and }
 ■ Brackets: [ and ]
Note that the grouping symbols cannot overlap. For example, (a{b)} is illegal.
Write a program to check whether a Java source-code file has correct pairs of
grouping symbols. Pass the source-code file name as a command-line argument.
*/