// package java-learning.03-array;

public class array {
    public static void main(String a[])
    {
        //static array
        int nums[] = {1, 2, 3, 4, 5};
        nums[0] = 10;
        System.out.println("x:" + nums[0]);

        //dynamic array
        int marks[] = new int[5];
        marks[0] = 90;
        marks[1] = 80;
        marks[2] = 70;
        marks[3] = 60;
        marks[4] = 50;      
        System.out.println("marks:" + marks[0]);

        //fetching all values 
        //introduce loop 
        for(int i=0; i<=4; i++)
        //4 coz of the indexing starting from 0 and ending at 4
        {
            System.out.println("marks:" + marks[i]);
        }
    }
}