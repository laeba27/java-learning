// One Java file can have many classes,
// but only ONE public class, and the file name must match the public class name.
// So if your file name is methodOverloading.java, this public class name is okay.

class Calculators {   // ✅ Class name (by convention, should be 'Calculators' or 'Calculator')

    // 🔹 Method 1 → add two int numbers
    // This is one version (overload) of the method 'add'
    public int add(int a, int b) {   // parameters: (int, int)
        return a + b;                // returns int
    }

    // 🔹 Method 2 → add three int numbers
    // Same method name 'add', BUT different parameter list (3 ints instead of 2)
    public int add(int a, int b, int c) {   // parameters: (int, int, int)
        return a + b + c;                   // returns int
    }

    // 🔹 Method 3 → add two double numbers
    // Same name 'add', but parameter types are double instead of int
    public double add(double a, double b) { // parameters: (double, double)
        return a + b;                       // returns double
    }
}

public class methodOverloading {  // ⚠ By convention, class names should start with Capital: MethodOverloading
    public static void main(String[] args) {

        // Creating object of Calculators class
        // Extra spaces inside parentheses are allowed, not an error:
        Calculators obj = new Calculators   ();

        // 🔸 Call 1: obj.add(5, 10)
        // Compiler sees arguments → (int, int)
        // It searches for add(int, int) → finds Method 1
        int r1 = obj.add(5, 10);          // will call: public int add(int a, int b)
        
        // 🔸 Call 2: obj.add(5, 10, 15)
        // Compiler sees arguments → (int, int, int)
        // It searches for add(int, int, int) → finds Method 2
        int r2 = obj.add(5, 10, 15);      // will call: public int add(int a, int b, int c)

        // 🔸 Call 3: obj.add(5.5, 2.3)
        // 5.5 and 2.3 are double literals by default
        // Compiler sees arguments → (double, double)
        // It searches for add(double, double) → finds Method 3
        double r3 = obj.add(5.5, 2.3);    // will call: public double add(double a, double b)

        // Printing results
        System.out.println(r1);  // 15
        System.out.println(r2);  // 30
        System.out.println(r3);  // 7.8
    }
}
