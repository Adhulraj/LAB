//TODO: OUTPUT

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1,b1,c1= 0;

        System.out.print("Enter the size of the first array : ");
        a1 = sc.nextInt();
        int[] a = new int[a1];
        
        System.out.print("Enter the size of second array : ");
        b1 = sc.nextInt();
        int[] b= new int[b1];

        c1=a1+b1;
        int[] c = new int[c1];

        System.out.print("Enter the elements of first array : ");
        for (int i = 0; i < a1; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter the elements of the second array : ");
        for (int i = 0; i < b1; i++) {
            b[i] = sc.nextInt();
        }

        //merge two arrays
        for (int i = 0; i < a1; i++) {
            c[i] = a[i];
        }

        for (int i = 0; i < b1; i++) {
            c[a1+i] = b[i];
        }

        System.out.println("First Array is :");
        for (int i = 0; i < a1; i++) {
            System.out.println(a[i]);
        }

        System.out.println("Second Array is :");
        for (int i = 0; i < b1; i++) {
            System.out.println(b[i]);
        }

        System.out.println("Merged Array is :");
        for (int i = 0; i < c1; i++) {
            System.out.println(c[i]);
        }

    }
}
