/*
AIM
    To write a program to check whether the triangle is equilateral, isoscless or scalene and find its area.

ALGORITHM
    
    Step 1: START
    Step 2: Read 3 sides (a, b, c).
    Step 3: Validate Triangle: a < b+c, b < a+c, c < a+b.
    Step 4: If Triangle :
        a==b==c: equilateral
        any 2 equal: isosceles
        all different: scalene 
    Step 5: Area (if valid):
        p = (a+b+c)/2
        area = √(p*(p-a)(p-b)(p-c)) 
    Step 6: Print type & area (or "Not a triangle")
    Step 7: STOP
 */

import java.util.Scanner;

class  Triangle {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declare variables 
        int a, b , c;
        double p, area;

        //Read sides fo triangle from the user 
        System.out.print("Enter 3 sides : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        //check if sides can form a Triangle
        if((a<b+c)&&(b<a+c)&&(c<a+b)){
            //Equilateral triangle if all sides are equal
            if((a==b)&&(b==c))
                System.out.println("Equilateral Triangle ");
            //isoscless triangle if any two sides are equal
            else if((a==b)||(a==c)||(b==c))
                System.out.println("Isoscless Triangle ");
            //ScaleneTriangle if no sides are equal
            else 
                System.out.println("Scalene Triangle");
            
            p = (a+b+c)/2;
            area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println("Area of Triangle is = "+area);
        } else {
            System.out.println("Cannot form a Triangle");
        }

   }

}

/*
 OUPUT

Enter 3 sides : 10 10 100
Cannot form a Triangle

Enter 3 sides : 11 12 13
Scalene Triangle
Area of Triangle is = 61.48170459575759

Enter 3 sides : 10 10 10
Equilateral Triangle
Area of Triangle is = 43.30127018922193

Enter 3 sides : 5 5 6
Isoscless Triangle
Area of Triangle is = 12.0

 */

