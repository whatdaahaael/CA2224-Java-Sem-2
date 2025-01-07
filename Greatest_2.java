import java.util.Scanner;
public class Greatest_2 {
    public static void main(String args[]) {
        int X, Y;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        X = in.nextInt();
        Y = in.nextInt();
        System.out.println((X>Y)?(X+" is Greater Than "+Y):(X+" is Not Greater Than "+Y));
    }
}
