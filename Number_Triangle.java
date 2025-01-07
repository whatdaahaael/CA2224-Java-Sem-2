import java.util.Scanner;
public class Number_Triangle {
    public static void main(String args[]) {
        int count;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Range: ");
        count=in.nextInt();

        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
