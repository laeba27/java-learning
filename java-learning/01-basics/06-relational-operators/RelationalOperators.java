// package java-learning.01-basics.06-relational-operators;


public class RelationalOperators {
    public static void main(String[] args) {
        // Comparison operators: ==, !=, >, <, >=, <=
        int a = 10;
        int b = 5;
        boolean isEqual = (a == b); // a is equal to b
        boolean isNotEqual = (a != b); // a is not equal to b
        boolean isGreaterThan = (a > b); // a is greater than b
        boolean isLessThan = (a < b); // a is less than b
        boolean isGreaterThanOrEqual = (a >= b); // a is greater than or equal to b
        boolean isLessThanOrEqual = (a <= b); // a is less than or equal to b
        System.out.println("Is a equal to b? " + isEqual);
        System.out.println("Is a not equal to b? " + isNotEqual);
        System.out.println("Is a greater than b? " + isGreaterThan);
        System.out.println("Is a less than b? " + isLessThan);
        System.out.println("Is a greater than or equal to b? " + isGreaterThanOrEqual);
        System.out.println("Is a less than or equal to b? " + isLessThanOrEqual);
    }
}
