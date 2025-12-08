package java-learning.03-array;

public class SumOfArray {
    
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; // Defining an array
        int sum = 0; // Variable to store the sum

        // Using for loop to calculate the sum of array elements
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // Adding each element to sum
        }

        System.out.println("Sum of array elements using for loop: " + sum);

        // Resetting sum for next calculation
        sum = 0;

        // Using enhanced for loop to calculate the sum of array elements
        for (int num : numbers) {
            sum += num; // Adding each element to sum
        }

        // Using while loop to calculate the sum of array elements
        int index = 0;
        while (index < numbers.length) {
            sum += numbers[index]; // Adding each element to sum
            index++;
        }

        

        System.out.println("Sum of array elements using enhanced for loop: " + sum);
    }
}
