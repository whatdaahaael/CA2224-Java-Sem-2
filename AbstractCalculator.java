import java.util.Scanner;

abstract class MathOperations{
    abstract int add(int a, int b);
    int sub(int a, int b){
        return a-b;
    }
}

public class AbstractCalculator extends MathOperations {
    @Override
    int add(int a, int b){
        return a+b;
    }

    public static void main(String args[]) {
        Scanner in =new Scanner(System.in);
        AbstractCalculator cal= new AbstractCalculator();
        int a, b;
        System.out.println("Enter 2 numbers:");
        a=in.nextInt();
        b=in.nextInt();

        System.out.println("Sum: "+cal.add(a, b));
        System.out.println("Diff: "+cal.sub(a, b));
        
        in.close();
    }
}
