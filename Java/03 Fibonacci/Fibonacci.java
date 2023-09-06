/*
 AIM
 To write a program to display Fibonacci series upto a limit

 ALGORITHM:
	Step 01: START
	Step 02: Declare n,a=0,b=1,c=1
	Step 03: Read n
	Step 04: print 0
	Step 05: while n>1 loop Step 06 and Step 07
	Step 06: 	Print c
	Step 07: 	Set a=b,b=c,n=n-1
	Step 08: STOP
 */

import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,a=0,b=1,c=1;
        System.out.println("Enter the limit: ");
        n = scan.nextInt();
        System.out.print("Fibonacci Series upto "+n+" : ");
        System.out.print("0");
        while(n>1){
            System.out.print(", "+c);
            c = a+b;
            a=b;
            b=c;
            n=n-1;
        }
    }
}

/*
 * OUTPUT
 * Enter the limit:
*  10
    Fibonacci Series upto 10 : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
 */