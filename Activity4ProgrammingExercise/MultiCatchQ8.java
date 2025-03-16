/*
 * Question 8:
 * Write a program with multiple catch blocks to
 * handle ArrayIndexOutOfBoundsException and
 * NumberFormatException.
 *
 *
 * 242BCA16
 * Sujan
 */

package Activity4ProgrammingExercise;

public class MultiCatchQ8 {
    public static void main(String args[]) {
        int a[]=new int[10];
        int n;
        String s="New";
        try{
            n=a[11];
            n=Integer.parseInt(s);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index not within limits:\n"+e);
        } catch (NumberFormatException e){
            System.out.println("String not a number:\n"+e);
        } finally {
            System.out.println("End");
        }
    }
}
