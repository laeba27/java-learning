// package java-learning.01-basics.04-type-conversion;

public class TypeConversion {

    public static void main(String[] args) {

        // Declare an integer variable 'a' with value 10
        int a = 10;

        // Explicitly cast 'a' (int) to 'k' (byte)
        // Since 10 fits in byte range (-128 to 127), the value remains unchanged
        byte k = (byte) a;

        // Print the value of 'k' — which will be 10
        System.out.println("k: " + k);
        // Declare another integer 'b' with value 250
        int b = 250;

        // Explicitly cast 'b' (int) to 'c' (byte)
        // 250 is outside byte range (-128 to 127), so overflow occurs
        // The value "wraps around" using modulo 256 (because byte is 8 bits)
        byte c = (byte) b;

        // Print the value of 'c' — overflowed value
        // 250 % 256 = -6  (you will see c = -6 in output)
        System.out.println("c: " + c);

        // Declare a float variable with a decimal value
        float g = 12.3f;

        // Manually cast the float to an int
        // This will remove the decimal part (i.e., truncate it)
        // 12.3 becomes 12 — not rounded, just the integer part is kept
        int t = (int) g;
        // Print the result
        // Output will be: t:12
        System.out.println("t: " + t);

        //TYPE PROMOTION -When you do arithmetic operations with different data types in Java, the smaller data types are automatically promoted to larger data types to avoid data loss.////////
        byte x = 10;
        byte y = 20;
        // Expression: a + b
        // Both 'a' and 'b' are promoted to 'int' before addition
        int z = x + y;
        System.out.println(z);  // Output: 30

    }
}
