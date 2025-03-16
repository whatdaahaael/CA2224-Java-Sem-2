/*
 * Question 3:
 * Develop an Interest interface which contains simpleInterest
 * and compInterest methods and static final field of
 * Rate 25%. Write a class to implement those methods.
 *
 *
 * 242BCA16
 * Sujan
 */

package Activity4ProgrammingExercise;
import java.util.Scanner;

interface Interest{
    float RATE=25.0f/100.0f;
    float simpleInterest(float p, float t);
    float compInterest(float p, float n, float t);
}
public class InterestInterfaceQ3 implements Interest {
    @Override
    public float simpleInterest(float p, float t) {
        return  p*RATE*t;
    }

    @Override
    public float compInterest(float p, float n, float t) {
        return (float) (p*Math.pow(1+(RATE/n), n*t));
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        float p, t, n, si, ci;
        InterestInterfaceQ3 calinterest=new InterestInterfaceQ3();
        System.out.println("Enter Principal and Time for Simple Interest.");
        p=in.nextFloat();
        t=in.nextFloat();
        si= calinterest.simpleInterest(p, t);
        System.out.println("Simple Interest: "+ si);

        System.out.println("Enter Principal, Time and Number of times interest compounds per year for Compound Interest.");
        p=in.nextFloat();
        t=in.nextFloat();
        n=in.nextFloat();
        ci= calinterest.compInterest(p, n, t);
        System.out.println("Compound Interest: "+ ci);

    }
}
