import java.util.Scanner;
public class Area_Circum_Circle {
    static float PI=22f/7f;

    static float AreaCir(float rad){
        return PI*rad*rad;
    }

    static float CircumCir(float rad){
        return 2*PI*rad;
    }

    public static void main(String args[]) {
        float rad, Area, CCum;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Radius of Circle");
        rad=in.nextFloat();

        Area=AreaCir(rad);
        CCum=CircumCir(rad);

        System.out.printf("Area of Circle is : %.2f\n", Area);
        System.out.printf("Circumference of Circle is : %.2f\n", CCum);
    }
}
