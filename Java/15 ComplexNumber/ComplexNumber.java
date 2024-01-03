//TODO OUTPUT

// AIM

// Using class and objects, write a java program to find the sum of two complex
// numbers (Hint: Use object as parameter to function).


// Algorithm
// Step 01 : Start
// Step 02 : Declare Complex numbers 'a' & 'b'
// Step 03 : Read real part of 'a' as r1
//    & imaginary part as img1
// Step 04 : Read real part of 'b' as r2
//    & imaginary part as img2
// Step 05 : Declare Complex number 'c'
// Step 06 : Assign real part of 'c' as r1 + r2
//    & imaginary part as img1 + img2
// Step 07 : Print real & imaginary part of Complex number 'c'
// Step 08 : Stop

public class ComplexNumber {
    int real, imaginary;
    ComplexNumber(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    static ComplexNumber addComplex(ComplexNumber a, ComplexNumber b){
        ComplexNumber sum = new ComplexNumber(0, 0);
        sum.real = a.real + b.real;
        sum.imaginary = a.imaginary + b.imaginary;
        return sum;
    }

    public static void main(String[] args) {
        ComplexNumber a= new ComplexNumber(12, 4);
        System.out.println("First Number : "+a.real+"+"+a.imaginary+"i");

        ComplexNumber b= new ComplexNumber(5, 3);
        System.out.println("Second Complex Number : "+b.real+"+"+b.imaginary+"i");

        ComplexNumber c= addComplex(a, b);
        System.out.println("Sum of Numbers : "+c.real+"+"+c.imaginary+"i");
    }
}
