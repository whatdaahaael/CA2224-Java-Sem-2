import java.util.Scanner;
public class Greatest_2 {
    public static void main(String args[]) {
        int X, Y;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        X = in.nextInt();
        Y = in.nextInt();
        if(X>Y){
            System.out.println(X+" is Greater Than "+Y);
        } else {
            System.out.println(X+" is Not Greater Than "+Y);
        }
    }
}
