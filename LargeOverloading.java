import java.util.Scanner;
public class LargeOverloading {
    static int largeInt(int a, int b){
        return(a>b)?a:b;
    }
    static double largeDouble(double a, double b, double c){
        double lar=(a>b)?a:b;
        return(c>lar)?c:lar;
    }

    public static void main(String args[]) {
        int a, b;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 2 numbers:");
        a=in.nextInt();
        b=in.nextInt();

        System.out.println("Largest btwn two numbers is: "+largeInt(a, b));
        System.out.println("Largest btwn 3 decimal numbers is: "+largeDouble(1.23f, 2.43f,0.99f));
    }
}
