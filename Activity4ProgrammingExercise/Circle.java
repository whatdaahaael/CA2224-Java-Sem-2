/*
 * Question 9:
 * Create two interfaces Shape and Color.
 * Let Shape extend Color, and implement
 * the combined interface in a class Circle.
 *
 *
 * 242BCA16
 * Sujan
 */

package Activity4ProgrammingExercise;

interface Shape{
    String getShape();
}
interface Color{
    String getColor();
}
public class Circle implements Shape, Color {
    @Override
    public String getShape() {
        return "Circle";
    }
    @Override
    public String getColor() {
        return "red";
    }

    public static void main(String args[]) {
        Circle c=new Circle();
        System.out.println(c.getShape());
        System.out.println(c.getColor());
    }
}
