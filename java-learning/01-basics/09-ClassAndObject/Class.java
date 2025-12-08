// Class declaration
class Calculator {   // 'Calculator' is the class name, and this whole block defines the class

    // You can declare variables inside the class if needed, e.g.:
    // int a;

    // Method inside the class
    // This method takes two integers and returns their sum
    public int add(int n1, int n2) {

        // Logic of addition
        int r = n1 + n2;    // 'r' stores the result of adding n1 and n2

        System.out.println("Inside add method");  // This prints when method is executed

        return r;   // Method returns the result back to whoever called it
    }
}

// Main class
public class Class {   // 'Class' is the class containing the main method (program execution starts here)

    public static void main(String[] a) {   // Main method (entry point of program)
        
        // We want to add two numbers, earlier we could do normally like:
        // int num1 = 4;
        // int num2 = 5;
        // int result = num1 + num2;
        // But here we are learning Classes & Objects, so we use a separate class instead

        // Creating an object of Calculator class
        // 'Calculator' is a user-defined data type (non-primitive)
        // 'calc' is a reference variable (it stores the object's address)
        // 'new' keyword allocates memory for the object
        Calculator calc = new Calculator();

        // Calling the 'add' method using object 'calc'
        // Passing values 4 and 5 as arguments
        int result = calc.add(4, 5);

        // Printing the output to the console
        System.out.println("The sum of two numbers is: " + result);
    }
}
