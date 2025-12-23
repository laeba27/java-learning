public class jagged {
    public static void main(String[] args) {

        // -------------------------------------------
        // STEP 1: Create a jagged array with 3 rows
        // (Columns will be assigned later)
        // -------------------------------------------
        int nums[][] = new int[3][];
        //Hum ek 2D array bana rahe hain jisme 3 rows hain.Par hum abhi columns nahi bata rahe.Isiliye ye jagged array ban raha hai — har row chhoti badi ho sakti hai.

        //Can we define columns but NOT rows?----- answer is NO
        //int nums2[][] = new int[][4]; // This will give error because Java needs to know number of rows at the time of array creation.

        // -------------------------------------------
        // STEP 2: Define different column sizes
        // This makes the array "jagged"
        // -------------------------------------------
        nums[0] = new int[2];  // Row 0 → 2 columns
        nums[1] = new int[3];  // Row 1 → 3 columns
        nums[2] = new int[4];  // Row 2 → 4 columns

        /*
        Jagged Structure:
        nums =
        [
            [?, ?],              // 2 elements
            [?, ?, ?],           // 3 elements
            [?, ?, ?, ?]         // 4 elements
        ]
        */

        // -------------------------------------------
        // STEP 3: Fill the jagged array with random numbers (0–9)
        // -------------------------------------------
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int)(Math.random() * 10);
            }
        }

        /*
        Example After Filling:
        Row 0 → [3, 7]
        Row 1 → [1, 9, 4]
        Row 2 → [5, 0, 8, 2]
        */

        // -------------------------------------------
        // STEP 4: Print the jagged array in clean format
        // Example Output:
        // 3, 7
        // 1, 9, 4
        // 5, 0, 8, 2
        // -------------------------------------------
        System.out.println("Jagged Array Output:");
        
        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums[i].length; j++) {

                System.out.print(nums[i][j]);  // print number

                // Print comma only between elements
                if (j < nums[i].length - 1) {
                    System.out.print(", ");
                }
            }

            System.out.println(); // Move to next line for next row
        }

    }
}



 //when you do new int[3][]
//Java allocates memory for 3 references to int arrays (rows) 
//Row 0 → null  
//Row 1 → null  
//Row 2 → null
/*
Later you fill them:

Row 0 → new int[2]
Row 1 → new int[3]
Row 2 → new int[4]
nums[0] = new int[2]; Row 0 ko hum bole: “Tumhare paas 2 cheezein aa sakti hain.”
nums[1] = new int[3]; Row 1 ko hum bole: “Tumhare paas 3 cheezein aa sakti hain.”
nums[2] = new int[4]; Row 2 ko hum bole: “Tumhare paas 4 cheezein aa sakti hain.”
Outer Loop:- Ye loop rows ke upar ghoomta hai.
i = row number.
Pehle row 0
Fir row 1
Fir row 2
Inner Loop:- Ye loop columns ke upar ghoomta hai.
j = column number.  Har row ke andar jitne columns hain, hum unke andar jaate hain.

Row 0 → 2 times
Row 1 → 3 times
Row 2 → 4 times
Har box me 0 se 9 tak koi bhi random number daal diya jaata hai.
if (j < nums[i].length - 1) {
    System.out.print(", ");
}
Ye condition ye ensure karti hai ki
Har value ke baad comma lagayenge,
par last value ke baad nahi.


*/
