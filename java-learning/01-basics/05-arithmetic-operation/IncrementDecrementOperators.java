public class IncrementDecrementOperators {
    public static void main(String[] args) {
        // Initialize x with value 10
        int x = 10;
        // Post-increment: x++ means return x first (10), then increment x to 11
        System.out.println("x (post-increment): " + x++);  
        // Output: 10
        // After this line, x becomes 11
        // Now x is 11 after the post-increment above
        System.out.println("x after post-increment: " + x);  
        // Output: 11
        // Pre-increment: ++x means increment x first (to 12), then return it
        System.out.println("x (pre-increment): " + ++x);  
        // x becomes 12 before being printed....... Output: 12
        // Post-decrement: x-- means return current x (12), then decrement it to 11
        System.out.println("x (post-decrement): " + x--);  
        // Output: 12
        // After this line, x becomes 11
        // Pre-decrement: --x means decrement x first (to 10), then return it
        System.out.println("x (pre-decrement): " + --x);  
        // x becomes 10 before being printed
        // Output: 10
    }
}
