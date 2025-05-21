import java.util.*;

public class Generic {
    public static void main(String args[]) {
        // Creating an empty Stack / Membuat Stack kosong
        Stack<String> STACK = new Stack<String>();

        // Use push() method to add elements / Menggunakan metode push() untuk menambahkan elemen
        STACK.push("Welcome");
        STACK.push("To");
        STACK.push("Geeks");
        STACK.push("For");
        STACK.push("Geeks");

        // Displaying the Stack / Menampilkan Stack
        System.out.println("Initial Stack: " + STACK);

        try {
            // Removing elements using pop() method / Menghapus elemen menggunakan metode pop()
            System.out.println("Popped element: " + STACK.pop());
            System.out.println("Popped element: " + STACK.pop());

            // Uncomment this if you want to test popping too much:
            for (int i = 0; i < 10; i++) {
                System.out.println("Popped: " + STACK.pop());
            }

        } catch (EmptyStackException e) {
            // Catch block handles popping from an empty stack
            System.err.println("Error: Tried to pop from an empty stack.");
        } finally {
            // This block always runs
            System.out.println("Final Stack status: " + STACK);
        }
    }
}
