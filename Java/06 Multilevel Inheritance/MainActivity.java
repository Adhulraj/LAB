/*
AIM 
To write a java program to demonstrate the order in which constructures are invoked in multilevel inheritance.

ALGORITHM
Step 01: START
Step 02: Create class Shape with a constructor that prints "This is a Shape".
Step 03: Create class Rectangle extends Shape with a constructor that prints "This is a Rectangle inherited from Shape".
Step 04: Create class called Cube that extends Rectangle with a constructor that prints "This is a Cube inherited from Rectangle".
Step 05: Create classMainActivity with a main() method that creates a Cube object and prints its output.
Step 06: STOP
*/

class Shape{
    Shape(){
        System.out.println("This is a Shape");
    }
}

class Rectangle extends Shape{
    Rectangle(){
        System.out.println("This is a Rectangle inherited from Shape");
    }
}

class Cube extends Rectangle{
    Cube(){
        System.out.println("This is a Cube inherited from Rectangle");
    }
}

public class MainActivity {
    public static void main(String[] args) {
        Cube c = new Cube();
    }
}

/*

OUTPUT:

This is a Shape
This is a Rectangle inherited from Shape
This is a Cube inherited from Rectangle
 */