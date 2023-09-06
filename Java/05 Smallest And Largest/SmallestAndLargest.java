/*
 AIM:
    Display the smallest, largest and second largest number from an array

ALGORITHM:
    Step 01:START
    Step 02: Read n
    Step 03: Declare array[n]
    Step 04: Read array[n]
    Step 05: for i=0 untill i<n loop Step 06
    Step 06:    for j=0 until j<n-1 loop Step 07
    Step 07:        if array[j]>array[j+1] goto Step 08 else goto Step 09
    Step 08:            Swap array[j] and array[j+1]
    Step 09: Print array[0],array[n-2],array[n-1] as smallest,second largest and largest
    Step 10: STOP
 */

 import java.io.*;
 import java.util.Scanner;

public class SmallestAndLargest {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n= s.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the elements into array: ");
        for(int i=0; i<n; i++) array[i] = s.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<n-1; j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("Smallest  = "+array[0]+"\nSecond Largest = "+array[n-2]+"\nLargest = "+array[n-1]);
    }
}

/*
 OUTPUT:
Enter the number of elements: 5
Enter the elements into array:
1
4
5
6
2
Smallest  = 1
Second Largest = 5
Largest = 6
 */
