/*
AIM
    Write java program to find the sum of the digits and reverse of a given number

ALGORITHM
Step 01: START
Step 02: Read num from user
Step 03: Initialize two variables, sum and rev, to 0.
Step 04: For i=num i!=0 i=i/10 loop Step 05
Step 05:    set dig = i%10 add dig to sum and multiply rev by 10 and add the digit.
Step 06: Print sum and rev
Step 07: STOP
 */

import java.util.Scanner;

public class SumAndReverse {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = s.nextInt();
        s.close();

        SumAndReverse obj = new SumAndReverse();
        obj.calculateSumAndReverse(n);
    }

    public void calculateSumAndReverse(int n) {
        int sum = 0, rev = 0;
        for (int i = n; i > 0; i /= 10) {
            int rem = i % 10;
            sum += rem;
            rev = (rev * 10) + rem;
        }
        System.out.println("Sum of digits : " + sum);
        System.out.println("Reverse of the number : " + rev);
    }

}

/*
 OUTPUT
Enter the number : 123
The sum of digits is 6
Reverse of the number is 321
 */