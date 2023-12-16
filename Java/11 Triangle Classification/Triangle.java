//No OUTPUT

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