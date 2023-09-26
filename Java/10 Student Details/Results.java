/*
 AIM
    To write a java program to display the total and grade of students, creating object class results
    
ALGORITHM
    Step 01: START
    Step 02: Create an object of the Results class.
    Step 03: Call the readStudentDetails() method on the object to read the student details.
    Step 04: Call the markTotalAndPerc() method on the object to calculate the total marks and grade of the student.
    Step 05: Call the displayStudentDetails() method on the object to display the student details, including the total marks and grade.
    Step 06: STOP
 */

 import java.util.Scanner;
 class Student {
    int age;
    int marks[] = new int[5], total=0;
    String regNo, name, course, grade;

    void readStudentdetails() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter register number : ");
        this.regNo = s.nextLine();
        System.out.print("Enter student name : ");
        this.name = s.nextLine();
        System.out.print("Enter student age : ");
        this.age = Integer.parseInt(s.nextLine());
        System.out.print("Enter course : ");
        this.course = s.nextLine();
    }

    void displayStudentDetails() {
        System.out.println("\nRegister Number : "+this.regNo);
        System.out.println("Student Name : "+this.name);
        System.out.println("Student Age : "+this.age);
        System.out.println("Course : "+this.course);
        for (int i = 0; i < 5; i++) 
            System.out.printf("Subject %d : %d \n", i+1, this.marks[i]);
        System.out.println("Total Marks : "+this.total);
        System.out.println("Student Grade : "+this.grade);
    }
    
}

public class Results extends Student {
    void markTotalAndPerc() {
        Scanner s= new Scanner(System.in);

        System.out.println("Enter the marks of five subjects (out of 100) : ");
        for (int i = 0; i < 5; i++) {
            super.marks[i] = s.nextInt();
            super.total += super.marks[i];
        }

        double perc = super.total / 5;
        super.grade = 
            perc >= 90 ? "A+" : perc >=80 ? "A" :
            perc >= 70 ? "B+" : perc >=60 ? "B" :
            perc >= 50 ? "C+" : perc >=40 ? "C" :
            perc >= 30 ? "D" : "E";
        
    }

    public static void main(String[] args) {
        Results res = new Results();

        res.readStudentdetails();
        res.markTotalAndPerc();
        res.displayStudentDetails();
    }
}

/*
 OUTPUT

Enter register number : 101
Enter student name : Alen
Enter student age : 20
Enter course : Bsc CS
Enter the marks of five subjects (out of 100) :
98 99 97 96 99

Register Number : 101
Student Name : Alen
Student Age : 20
Course : Bsc CS
Subject 1 : 98
Subject 2 : 99
Subject 3 : 97
Subject 4 : 96
Subject 5 : 99
Total Marks : 489
Student Grade : A+
 */