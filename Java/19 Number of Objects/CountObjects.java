/*
 AIM 
 Write a program to count the number of objects in a class

 ALGORITHM


1. Start
2. Initialize:
   - Set a counter to 0.
3. Create Objects:
   - Create objects of the class.
   - Increment the counter with each object creation.
4. Output:
   - Print the final counter value (number of objects).
5. Stop

 */

public class CountObjects {
    static int count = 0;
    //various types of constructor
    public CountObjects(){
        count +=1;
    }

    public CountObjects(int i){
        count += 1;
    }

    public static void main(String[] args) {
        CountObjects obj1 = new CountObjects();
        CountObjects obj2 = new CountObjects(9);
        CountObjects obj3 = new CountObjects();
        //display count
        System.out.println("Number of objects counted : "+CountObjects.count);
    }
}
