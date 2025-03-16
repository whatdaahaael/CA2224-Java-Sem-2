/*
 * Question 2:
 * Develop an abstract Reservation class which has Reserve
 * abstract method. Implement the subclasses like
 * ReserveTrain and ReserveBus classes and implement the same.
 *
 *
 * 242BCA16
 * Sujan
 */

package Activity4ProgrammingExercise;

abstract class Reservation{
    abstract void reserve(String s);
}

class ReserveTrain extends Reservation{
    @Override
    void reserve(String s) {
        System.out.println("Train Ticket Reserved:\n"+s);
    }
}
class ReserveBus extends Reservation{
    @Override
    void reserve(String s) {
        System.out.println("Bus Ticket Reserved:\n"+s);
    }
}
public class ReservatorQ2 {
    public static void main(String args[]) {
        ReserveTrain rt=new ReserveTrain();
        ReserveBus rb=new ReserveBus();
        rt.reserve("A12");
        rb.reserve("C06");
    }
}
