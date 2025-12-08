public class DataTypes {
    public static void main(String[] args) {
        // Integer types
        byte byteValue = 100; // 1 byte
        // -2^7 TO  2^7 -1 (-128 TO -127)
        short shortValue = 10000; // 2 bytes
        int intValue = 100000; // 4 bytes
        long longValue = 100000L; // 8 bytes 
        // Floating-point types
        float floatValue = 10.5f; // 4 bytes good for limited values 
        double doubleValue = 20.99; // 8 bytes can have more values max precision 
        // Character type
        char charValue = 'A'; // 2 bytes unicode all type of language 
        // Boolean type
        boolean booleanValue = true; // 1 bit or false  
        // String type (not a primitive type, but commonly used)
        String stringValue = "Hello, Java!"; // Reference type
        // Printing the values
        System.out.println("Byte Value: " + byteValue);
        System.out.println("Short Value: " + shortValue);
        System.out.println("Int Value: " + intValue);
        System.out.println("Long Value: " + longValue);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Char Value: " + charValue);
        System.out.println("Boolean Value: " + booleanValue);
        System.out.println("String Value: " + stringValue);
        // Literals
        int decimalLiteral = 42; // Decimal literal
        int binaryLiteral = 0b1010; // Binary literal
        int octalLiteral = 012; // Octal literal
        int hexadecimalLiteral = 0x2A; // Hexadecimal literal

        System.out.println("Decimal Literal: " + decimalLiteral);
        System.out.println("Binary Literal: " + binaryLiteral);
        System.out.println("Octal Literal: " + octalLiteral);
        System.out.println("Hexadecimal Literal: " + hexadecimalLiteral);

        char c = 'a';
        c++;
        System.out.println(c);
        
    }
}
