/*
 * Question 6:
 * Create a package school with sub-packages students and
 * teachers, each containing a class. Access them from a
 * main program.
 *
 *
 * 242BCA16
 * Sujan
 */

package Activity4ProgrammingExercise.school;
import Activity4ProgrammingExercise.school.students.Stud;
import Activity4ProgrammingExercise.school.teachers.Teacher;

public class PkgTest {
    public static void main(String args[]) {
        Stud s1=new Stud();
        Teacher t1=new Teacher();
        s1.display("Rahul");
        t1.display("Alex");
    }
}
