import java.util.Scanner;
class Person{
    String name;
    int age;
    Person(String n, int a){
        name=n;
        age=a;
    }
}
public class Employee extends Person {
    int salary;
    Employee(String n, int a, int s){
        super(n, a);
        salary=s;
    }

    void display(){
        System.out.printf("%s aged %d has a salary %d.\n", name, age, salary);
    }

    public static void main(String args[]){
        String n;
        int a, s;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter name:");
        n=in.nextLine();
        System.out.println("Enter age and salary:");
        a=in.nextInt();
        s=in.nextInt();

        Employee e1=new Employee(n, a, s);
        e1.display();
    }
}
