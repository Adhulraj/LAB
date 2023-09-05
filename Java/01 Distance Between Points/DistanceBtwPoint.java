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