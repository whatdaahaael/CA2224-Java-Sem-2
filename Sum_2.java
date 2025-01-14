import java.util.Scanner;
public class Sum_2 {
    int Add(){
        int defA=261;
        int defB=159;
        return defA+defB;
    }
    int Add(int A, int B){
        return A+B;
    }
    float Add(float A, float B){
        return A+B;
    }

    public static void main(String args[]) {
        int a, b;
        Scanner in = new Scanner(System.in);
        Sum_2 val=new Sum_2();

        System.out.println(val.Add());

        System.out.println("Enter A and B:");
        a=in.nextInt();
        b=in.nextInt();

        System.out.println(val.Add(a, b));
        System.out.println(val.Add(1.23f, 21.1f));

    }
}
