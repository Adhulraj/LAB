//No OUTPUT

// AIM 

// Write a multi thread java program for displaying odd numbers and even
// numbers up to a limit (Hint: Implement thread using Runnable interface).


// Algorithm
// Step 01 : Start
// Step 02 : Use a boolean variable odd; to print odd numbers, it's value should be true and vice versa to print even numbers
// Step 03 : Create two methods printOdd() and printEven() to print odd numbers and even numbers respectively
// Step 04 : Create two threads: t1 for odd & t2 for even
// Step 05 : Thread t1 will call printEven() method and t2 will call printOdd()
// Step 06 : If boolean odd is true in printEven() method, t1 will wait
// Step 07 : If boolean odd is false in printOdd() method, t2 will wait
// Step 08 : Stop


public class PrintEvenOddTester {
    public static void main(String[] args) {
        Printer print = new Printer();
        Thread t1 = new Thread(new TaskEvenOdd(print, 10, false));
        Thread t2 = new Thread(new TaskEvenOdd(print, 10, true));

        t1.start();
        t2.start();
    }
}

class TaskEvenOdd implements Runnable{
    private int max;
    private Printer print;
    private boolean isEvenNumber;

    TaskEvenOdd(Printer print, int max, boolean isEvenNumber){
        this.print = print;
        this.max = max;
        this.isEvenNumber = isEvenNumber;
    }

    public void run() {
        int n = isEvenNumber == true ? 2: 1;
        while (n<=max) {
            if (isEvenNumber==true) {
                System.out.println(Thread.currentThread().getName());
                print.printEven(n);
            } else {
                System.out.println(Thread.currentThread().getName());
                print.printOdd(n);
            }
            n += 2;
        }
    }
}

class Printer{
    boolean isOdd = false;
    synchronized void printEven(int number){
        while (!isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isOdd = false;
        System.out.println("Even "+ number);
        notifyAll();
    }

    synchronized void printOdd(int number){
        while (isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isOdd = true;
        System.out.println("Odd "+ number);
        notifyAll();   
    }
}
