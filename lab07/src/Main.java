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