/* 
AIM :
    Write a java program to claculate distance between two points

 ALGORITHM:
    Step 1:START
    Step 2:Declare x1,x2,y1,y2,dis
    Step 3:Read points x1,y1,x2,y2
    Step 4:Calculate d = ✓(x2-x1)²=(y2-y1)²
    Step 5:Print d
    Step 6:STOP
 */

import java.util.Scanner;
class DistanceBtwPoint{
    public static void main(String[] args) {
        int x1,x2,y1,y2;
        double dis;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x1 point: ");
        x1 = scan.nextInt();
        System.out.println("Enter x2 point: ");
        x2 = scan.nextInt();
        System.out.println("Enter y1 point: ");
        y1 = scan.nextInt();
        System.out.println("Enter y2 point: ");
        y2 = scan.nextInt();
        dis = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("Distance between ("+x1+", "+y1+") and ("+x2+", "+y2+") is "+dis);

    }
}


/*

OUTPUT

Enter x1 point: 
2
Enter x2 point:
4
Enter y1 point:
6
Enter y2 point:
8
Distance between (2, 6) and (4, 8) is 2.8284271247461903
 */