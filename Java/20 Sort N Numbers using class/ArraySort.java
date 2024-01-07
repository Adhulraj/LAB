/*
 AIM

 Wite a program to sort n numers using class

 ALGORITHM


1. Start
2. Get Input:
   - Get the number of elements from the user.
   - Create an array with that size.
   - Fill the array with elements entered by the user.
3. Sort Array:
   - Use a nested loop to compare elements in pairs.
   - Swap elements if they are in the wrong order.
4. Print Sorted Array:
   - Print the sorted elements of the array.
5. Stop


 */

import java.util.Scanner;

public class ArraySort
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.print("Enter the number of elements : ");
		int n = s.nextInt();
		int array[] = new int[n];
		System.out.print("Enter the elements into array : ");
		for (int i=0; i<n; i++) array[i] = s.nextInt();

		for (int i=0; i<n; i++)
			for (int j=0; j<n-1; j++)
				if (array[j] > array[j+1])
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}

		System.out.print("The sorted array is : ");
		for (int i = 0; i < n; i++)
				System.out.print(array[i] + " ");
			System.out.println();
    s.close();
	}
}

/*
  OUTPUT

Enter the number of elements : 4
Enter the elements into array : 2 3 1 4
The sorted array is : 1 2 3 4 
 */