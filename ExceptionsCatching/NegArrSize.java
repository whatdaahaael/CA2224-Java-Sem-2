package ExceptionsCatching;
import java.util.Scanner;
public class NegArrSize {
    public static void main(String args[]) {
        int n, arr[];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Size:");
        n=in.nextInt();
        try{
            arr=new int[n];
        }catch (NegativeArraySizeException e){
            System.out.println("Negative Arra Size:\n"+e);
        }
        if(n>=0){
            System.out.println("Initialized Successfully.");
        }
        System.out.println("End.");
    }
}
