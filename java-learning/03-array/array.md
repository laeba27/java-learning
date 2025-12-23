Variables can store only a single value (0:09).
If you have many values (e.g., 10, 100) and want to store them, creating a separate variable for each is inefficient and hard to manage (1:00).
An array allows you to store multiple values of the same type in a single variable (1:24).
Arrays can be imagined as a "tray of cups" that can hold many items, making it easier to manage data (2:25).
When creating an array, you can either initialize it with values or specify its fixed size (3:02).





multi-dimensional array
What is a Multi-Dimensional Array? It's introduced as an "array of arrays" (1:19). The video illustrates how a single large array can contain multiple smaller arrays, each with its own elements (1:30).
Declaration and Initialization: You declare a 2D array by using two sets of square brackets, for example, int[][] nums = new int[3][4]; where the first number is the number of inner arrays (rows) and the second is the size of each inner array (columns) (2:08, 5:10).
Accessing Elements: Elements are accessed using two indices: nums[row_index][column_index]. For example, nums[0][0] accesses the first element of the first inner array (3:32, 4:10).
Iterating and Printing: Nested loops (a loop inside another loop) are used to process all elements. The outer loop iterates through the rows, and the inner loop iterates through the columns of each row (5:37).
Assigning Random Values: The video demonstrates how to fill the array with random integer values using Math.random(), which returns a double between 0.0 and 1.0. This value is then multiplied and type-casted to an integer (7:50, 9:55).
Enhanced For Loop: It also shows how to use a nested enhanced for loop (or "for-each" loop) to iterate through the elements of a 2D array (11:13).


Java me arrays ka shape fix tarike se decide hota hai.
int nums[][] = new int[rows][columns];
Rows → outer boxes
Columns → inner boxes

