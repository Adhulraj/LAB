/*
 AIM
 Write a program to find trace and transpose of a matrix

 ALGORITHM
1. Start
2. Input:
   - Get matrix dimensions from the user.
   - Create the matrix.
   - Fill the matrix with elements.
3. Transpose and Trace:
   - Simultaneously:
      - Create the transpose matrix by swapping elements.
      - Calculate the trace of the original matrix.
4. Output:
   - Print the transpose matrix.
   - Print the trace.
5. Stop

 */

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        //declare variable
        int[][] matrix;
        int[][] transpose;
        int sum=0, r, c;

        //Scanner class object to read imput values
        Scanner sc= new Scanner(System.in);

        //Read size of matrix from user 
        System.out.print("Enter the number of rows : ");
        r = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        c = sc.nextInt();
        if (r!=c) {
            System.out.println("Only Square matrix allowed ");
        } else {
            //initialze matrix
            matrix = new int[r][c];
            transpose = new int[c][r];

            //read matrix values from user 
            System.out.print("Enter the elements of matrix: ");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            //print entered matrix
            System.out.println("\nGiven Matrix is : ");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }

            //find transpose and sum of diagonal elements
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    transpose[j][i] = matrix[i][j];
                    if (i==j) {
                        sum += matrix[i][j];
                    }
                }
            }

            //display result
            System.out.println("\nThe Trace of the givem matrix is = "+ sum);

            System.out.println("\nTranspose matrix ");
            for (int i = 0; i < c; i++) {
                for (int j = 0; j < r; j++) {
                    System.out.print(transpose[i][j]+" ");
                }
                System.out.println();
            }
        }
    }    
}
