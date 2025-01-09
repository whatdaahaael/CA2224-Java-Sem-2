import java.util.Scanner;
public class Vegetable {
    String name, color;
    Vegetable(String n, String c)
    {
        name=n;
        color=c;
    }

    public String toString()
    {
        return String.format("Name : %s\nColor : %s", name, color);
    }

    public static void main(String args[]) {
        String n, c;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Vegetable Name and Color");
        n=in.nextLine();
        c=in.nextLine();
        Vegetable veggie=new Vegetable(n, c);
        System.out.println(veggie.toString());
    }
}
