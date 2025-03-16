/*
 * Question 7:
 * Create a custom exception InvalidAgeException.
 * Throw it if the user enters an age less than 18.
 *
 *
 * 242BCA16
 * Sujan
 */

package Activity4ProgrammingExercise;

class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
        super(s);
    }
}
public class CustExcepQ7 {
    static void checkAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age "+age+" not Valid.");
        } else {
            System.out.println("Valid.");
        }
    }

    public static void main(String args[]) {
        try{
            checkAge(13);
        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println("End.");
    }
}
