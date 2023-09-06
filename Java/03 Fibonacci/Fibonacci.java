import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,a=0,b=1,c=1;
        System.out.println("Enter the limit: ");
        n = scan.nextInt();
        System.out.print("Fibonacci Series upto "+n+" : ");
        System.out.print("0");
        while(n>1){
            System.out.print(", "+c);
            c = a+b;
            a=b;
            b=c;
            n=n-1;
        }
    }
}
