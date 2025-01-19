import java.util.Scanner;
public class Prime_Number {
    static boolean isPrime(int num) {
        if (num < 2) return false; // Numbers less than 2 are not prime

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    public static void main(String args[]) {
        int num;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number:");
        num=in.nextInt();
        if(isPrime(num)){
            System.out.println(num+" is a Prime Number.");
        } else {
            System.out.println(num+" is not a Prime Number.");
        }
    }
}
