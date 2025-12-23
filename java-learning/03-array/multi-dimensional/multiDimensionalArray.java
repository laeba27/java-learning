// package java-learning.03-array;

public class multiDimensionalArray {
   public static void main(String[] args) {
       
         //declaring and initializing 2D array
      int nums[][] = new int [3][4];
         for (int i=0 ; i<3 ; i++){
         for (int j=0 ; j<4 ; j++){
             nums[i][j]= (int)(Math.random()*10);
            System.out.println(nums[i][j]);
         }
      }
       // Creates a 2D integer array with 3 rows and 4 columns
      // By default, all elements are initialized to 0
      for (int i=0 ; i<3 ; i++){
          // Outer loop → iterates through rows (0 to 2)
         for (int j=0 ; j<4 ; j++){
             // Inner loop → iterates through columns (0 to 3)
            System.out.print(nums[i][j] + " ");
             // Prints each element of the array (currently 0) followed by a space
         }
         System.out.println();
          // After printing one row, moves to the next line
      }

      //enhanced for loop
  for (int row[] : nums) {
         // row refers to each 1D array inside nums
         for (int col : row) {
            // col refers to each element inside that row
            System.out.print(col + " ");
         }
         System.out.println(); // to print next row on new line
      }

   }
}


/*0 0 0 0 
  0 0 0 0 
  0 0 0 0 */



  /*
  Math.random() generates a random decimal number between 0.0 and 1.0, for example:
  0.245879
0.98723
0.56111
It is always: >= 0.0 and < 1.0
To scale this to a range of 0 to 9, we multiply the result by 10:
Math.random() * 10
This gives us a decimal number between 0.0 and 10.0 (not including 10.0), for example:
2.45879
9.8723
5.6111
To convert this decimal number to an integer, we use (int) to cast it:
(int)(Math.random() * 10)
This truncates the decimal part, resulting in an integer between 0 and 9, for example:
2
9
5
So, (int)(Math.random() * 10) generates a random integer in the range 0 to 9.
 */