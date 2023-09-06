/*
 AIM:
  to write a program to find th armstrong numbers within a range

ALGORITHM:
    Step 01: START
    Step 02:
 */

 import java.io.*;
 import java.lang.Math;
 import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the lower an dupper limit: ");
        int low = s.nextInt();
        int high = s.nextInt();
        System.out.println("Armstrong numbers within "+low+" and "+high+" is ");
        for(int i=low+1; i<high; ++i){
            int num=0;
            int dig = (int)Math.log10(i)+1;
            for(int temp=i; temp!=0; temp/=10){
                int rem =temp%10;
                num+=Math.pow(rem,dig);
            }
            if (i==num) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
/*
 OUTPUT
Enter the lower an dupper limit:
0
1000
Armstrong numbers within 0 and 1000 is
1 2 3 4 5 6 7 8 9 153 370 371 407
 */