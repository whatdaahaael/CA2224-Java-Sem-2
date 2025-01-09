import java.util.Scanner;
public class Person {
    String name, address, phnum, email;

    Person(){
        name="";
        address="";
        phnum="";
        email="";
    }

    void InputData(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Name and Address:");
        name=in.nextLine();
        address=in.nextLine();
        System.out.println("Enter Phone Number and Email:");
        phnum=in.nextLine();
        email=in.nextLine();
    }

    void DisplayDetails(){
        System.out.printf("Name :\t\t%s\nAddress :\t%s\n", name, address);
        System.out.printf("Ph. No. \t%s\nEmail :\t\t%s\n", phnum, email);
    }

    public static void main(String args[]) {
        Person p1 = new Person();
        p1.InputData();
        p1.DisplayDetails();
    }

}
