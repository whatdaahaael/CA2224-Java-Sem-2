import java.util.Scanner;
public class Area_Rectangle {
    public static void main(String args[]) {
        float l, w, Area;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Length and Width");
        l=in.nextFloat();
        w=in.nextFloat();

        Area=l*w;
        System.out.println("Area of Rectangle "+l+" and "+w+ " is : "+Area);
        in.close();
    }
}
