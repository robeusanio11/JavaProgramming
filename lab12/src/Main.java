import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        BST<Integer> recursionBST = new BST<>();
        BSTstack<Integer> stackBST = new BSTstack<>();
        
        System.out.println("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            int num = input.nextInt();
            recursionBST.insert(num);
            stackBST.insert(num);
        }
        System.out.println("recursion preorder: ");
        recursionBST.preorder();
        System.out.println("\nstack preorder: ");
        stackBST.preorder();
        System.out.println("\nrecursion inorder: ");
        recursionBST.inorder();
        System.out.println("\nstack inorder: ");
        stackBST.inorder();
    }
}
/* (Implement preorder traversal without using recursion) Implement the pre-
 * order method in BST using a stack instad of recursion, Write a test program
 * that prompts the user to enter 10 integers, stores them in a BST, and invokes the 
 * preorder method to display the elements. INORDER
 * 
 */

