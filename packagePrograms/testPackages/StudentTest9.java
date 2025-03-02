package packagePrograms.testPackages;
import packagePrograms.student.fulltime.bca.Student;

import java.util.Scanner;
public class StudentTest9 {
    public static void main(String args[]) {
        Scanner in= new Scanner(System.in);
        String n, s;
        int a;
        System.out.println("Enter name, gender and age.");
        n=in.next();
        s=in.next();
        a=in.nextInt();

        Student s1=new Student();
        s1.inputDetails(n, s, a);
        s1.displayDetails();

    }
}
