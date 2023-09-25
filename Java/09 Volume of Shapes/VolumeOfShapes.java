/*
 AIM
    To write a java program to find volume of cube, rectangular box, cylinder using function overloading.
    
ALGORITHM

    Step 01: START
    Step 02: Define three overloaded volume() methods, each of which calculates the volume of a different shape: Cube, cylinder, and rectangular box.
    Step 03: Prompt the user to choose a shape.
    Step 04: Depending on the user's choice, call the appropriate volume() method.
    Step 05: Display the volume to the user.
    Step 06: STOP

 */

 import java.io.*;
 import java.util.*;
public class VolumeOfShapes {
    static double volume(double side){
        return Math.pow(side,3);
    }

    static double volume(double radius, double height){
        return Math.PI * radius * height;
    }

    static double volume(double length, double breadth, double height){
        return length * breadth * height;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Choose from below. \n1. Cube \n2. Cylinder \n3. Rectangular Box");
        short option = s.nextShort();
        switch (option) {

            case 1:
                System.out.println("Enter the length of each sides : ");
                System.out.println("The volume is "+volume(s.nextDouble()));
                break;

            case 2:
                System.out.println("Enter the radius & heigth : ");
                System.out.println("The volume is : "+volume(s.nextDouble(), s.nextDouble()));
                break;
            
            case 3:
                System.out.println("Enter the length, breadth & heigth : ");
                System.out.println("The volume is "+volume(s.nextDouble(), s.nextDouble(), s.nextDouble()));
                break;

            default:
                System.out.println("Invalid Option");
                break;
        }
    }
}

/*
 OUTPUT 
Choose from below.
1. Cube
2. Cylinder
3. Rectabgular Box
1
Enter the length of each sides :
12
The volume is 1728.0

1. Cube
2. Cylinder
3. Rectangular Box
2
Enter the radius & heigth :
2 10
The volume is : 62.83185307179586

Choose from below. 
1. Cube
2. Cylinder
3. Rectangular Box
3
Enter the length, breadth & heigth :
10 20 10
The volume is 2000.0

 */
