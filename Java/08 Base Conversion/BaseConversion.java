/*
AIM
    Write a program to perform base conversion
        a) integer to Binary
        b) Integer to Octal
        c) Integer to Hexadecimal

ALGORITHM

Step 01: START
Step 02: Get the base 10 number and the base to be converted to from the user.
Step 03: Initialize an array to store the result.
Step 04: Iterate over the base 10 number, one digit at a time, using a do-while loop.
Step 05: For each digit, find the remainder after dividing the number by the base to be converted to.
Step 06: Convert the remainder to a character using the ASCII table.
Step 07: Add the character to the result array.
Step 08: Divide the number by the base to be converted to.
Step 09: Continue iterating until the number is 0.
Step 10: Print the result array in reverse order.
 
 */

import java.util.Scanner;
public class BaseConversion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Base 10 Number : ");
        int n = s.nextInt();

        System.out.print("Choose the base to be converted : \n1. Binary \n2. Octal \n3. hexadecimal \n--> ");
        short choice = s.nextShort();
        int base = (choice == 1)? 2 : (choice == 2) ? 8 : (choice == 3) ? 16 : 0;
        int num = n, count = 0;
        char result[] = new char[15];

        do {
            int rem = num%base;
            int digit = '0' + rem;
            if (digit > '9')
                digit +=7;
            result[count++] = (char)digit;
            num/=base;
        } while (num!=0);

        System.out.print("\n"+base+" equivalent of num "+n+" is ");
        for (int i = count-1; i >= 0; --i) 
            System.out.print(result[i]);
        System.out.println();
    }
}

/*
 OUTPUT

 Enter a Base 10 Number : 25
Choose the base to be converted :
1. Binary
2. Octal
3. hexadecimal
--> 1

2 equivalent of num 25 is 11001

Enter a Base 10 Number : 25
Choose the base to be converted :
1. Binary
2. Octal
3. hexadecimal
--> 2

8 equivalent of num 25 is 31

Enter a Base 10 Number : 25
Choose the base to be converted :
1. Binary
2. Octal
3. hexadecimal
--> 3

16 equivalent of num 25 is 19
 */