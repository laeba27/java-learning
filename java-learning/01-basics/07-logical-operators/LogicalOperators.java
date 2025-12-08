// package java-learning.01-basics.07-logical-operators;

public class LogicalOperators {
    public static void main(String[] args) {
        // Logical operators: &&, ||, !
        int x = 9;
        int y = 7;
        int a = 7;
        int b = 3;
        boolean result1 = (x > y) && (a > b); // Logical AND: both conditions must be true
        boolean result2 = (b > y) || (a > b); // Logical OR: at least one condition must be true
        boolean result3 = !(x == y); // Logical NOT: negates the condition
        System.out.println("Result 1: " + result1); // Output: true
        System.out.println("Result 2: " + result2); // Output: true
        System.out.println("Result 3: " + result3); // Output: true
    }
}
