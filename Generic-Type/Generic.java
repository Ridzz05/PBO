
import java.util.*;

public class Generic {
    public static void main(String args[])
    {
        // Creating an empty Stack / Membuat Stack kosong
        Stack<String> STACK = new Stack<String>();

        // Use add() method to add elements / Menggunakan metode add() untuk menambahkan elemen
        STACK.push("Welcome");
        STACK.push("To");
        STACK.push("Geeks");
        STACK.push("For");
        STACK.push("Geeks");

        // Displaying the Stack / Menampilkan Stack
        System.out.println("Initial Stack: " + STACK);

        // Removing elements using pop() method / Menghapus elemen menggunakan metode pop()
        System.out.println("Popped element: " + STACK.pop());
        System.out.println("Popped element: " + STACK.pop());

        // Displaying the Stack after pop operation / Menampilkan Stack setelah operasi pop
        System.out.println("Stack after pop operation " + STACK);
    }
}