/*
 * AIM:
 * Write a program to find sum, differnce, product, quotient an dremainder of two numbers passed as command line
 * 
 * 
 * ALGORITHM:
 * 	Step 01: START
 * 	Step 02:
 */
import java.io.*;
import java.util.*;

public class Operation {
    public static void main(String[] args) throws IOException{
		int a,b,sum,diff,mul,quo,rem;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		sum= a+b;
		diff = a-b;
		mul = a*b;
		quo = a/b;
		rem = a%b;
		System.out.println("The sum = "+sum);
		System.out.println("The diff = "+diff);
		System.out.println("The product = "+mul);
		System.out.println("The quo = "+quo);;
		System.out.println("The rem = "+rem);
	}
}

/*
 * OUTPUT
 * 
 * 
 */