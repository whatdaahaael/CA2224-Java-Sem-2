import java.util.Scanner;

public class Two_Large_4 {
    public static void main(String args[]) {
        int N1,N2,N3,N4,Great,SGreat;
        Scanner in=new Scanner(System.in);

        System.out.println("Enter number 1:");
        N1=in.nextInt();
        System.out.println("Enter number 2:");
        N2=in.nextInt();
        System.out.println("Enter number 3:");
        N3=in.nextInt();
        System.out.println("Enter number 4:");
        N4=in.nextInt();

        Great=N1;
        Great=(Great<=N2)?N2:Great;
        Great=(Great<=N3)?N3:Great;
        Great=(Great<=N4)?N4:Great;

        SGreat=-999;
        if (N1 != Great) SGreat = (SGreat<=N1)?N1:SGreat;
        if (N2 != Great) SGreat = (SGreat<=N2)?N2:SGreat;
        if (N3 != Great) SGreat = (SGreat<=N3)?N3:SGreat;
        if (N4 != Great) SGreat = (SGreat<=N4)?N4:SGreat;


        System.out.println("First Greatest Number is: "+Great);
        System.out.println("Second Greatest Number is: "+SGreat);
    }
}
