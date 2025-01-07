import java.util.Scanner;
public class Largest_3 {

    public static void main(String args[]) {
        int Great,N2,N3;
        Scanner in=new Scanner(System.in);

        System.out.println("Enter number 1:");
        Great=in.nextInt();
        System.out.println("Enter number 2:");
        N2=in.nextInt();
        System.out.println("Enter number 3:");
        N3=in.nextInt();

        Great=(Great<=N2)?N2:Great;
        Great=(Great<=N3)?N3:Great;

        System.out.println("Greatest Number is: "+Great);
    }
}
