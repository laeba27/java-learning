A method is a block of code that performs a task.
It runs only when it is called.returnType methodName(parameters) {
    // method body / logic
}



| Term       | Meaning                                 |
| ---------- | --------------------------------------- |
| Parameters | Variables in method definition          |
| Arguments  | Actual values passed during method call |
| Rule                                                 | Example        |
| ---------------------------------------------------- | -------------- |
| Method must be inside a class                        | ✔              |
| Method must be called to execute                     | ✔              |
| Only one return statement per execution path         | return result; |
| Method name cannot be duplicated without overloading | ❌              |





What is Method Overloading (in depth)?
1️⃣ Definition

Method Overloading = Same method name, different parameter list in the same class.

Java decides which method to call based on:

Number of arguments

Types of arguments

Order of arguments

This decision happens at compile time → called compile-time polymorphism or static binding.



Arguments: 5 → int, 10 → int → (int, int)

Java searches: “Is there an add(int, int) ?”

Yes → public int add(int a, int b)

So this one is called.



int add(int a, int b) { ... }
double add(int a, int b) { ... }  // ❌ ERROR




int add(int x, int y) { ... }
int add(int a, int b) { ... }  // ❌ same signature




⚠ 3. Widening Conversion
obj.add(5, 5.5);
Here:

5 is int

5.5 is double

Java will convert int → double and try to match a method like add(double, double)


⚠ 4. Ambiguous Overloads (advanced but good to know)

If you have:

void show(int a, long b) { }
void show(long a, int b) { }


and call:

show(5, 5);
Both methods could match → Java gets confused → compile-time error: reference to show is ambiguous.



Method overloading allows multiple methods with the same name but different parameter lists, improving readability, flexibility, and implementing compile-time polymorphism.



| Feature               | **Method Overloading**                             | **Method Overriding**                             |
| --------------------- | -------------------------------------------------- | ------------------------------------------------- |
| What it is            | Same method name, **different parameter list**     | Same method name, **same parameter list**         |
| Location              | Happens **within same class**                      | Happens **in parent–child (inheritance)**         |
| Purpose               | To perform **similar tasks with different inputs** | To **change/modify** parent class method behavior |
| Polymorphism Type     | **Compile-time (static)**                          | **Runtime (dynamic)**                             |
| Decision Time         | Method selected during **compile time**            | Method selected during **runtime (JVM)**          |
| Inheritance required? | ❌ Not required                                     | ✔ Required                                        |
| Return Type           | Can be same or different                           | Must be same (or covariant)                       |
| Access Modifier       | No restriction                                     | Cannot reduce visibility (public → private ❌)     |
| Throws Clause         | No rule                                            | Cannot throw broader exception                    |
| Use Case              | Flexibility                                        | Specialization                                    |




               POLYMORPHISM
                   |
      -------------------------------
      |                             |
 Compile-time (static)     Runtime (dynamic)
      |                             |
 Method Overloading         Method Overriding



