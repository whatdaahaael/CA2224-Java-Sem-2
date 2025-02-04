import java.util.Scanner;

class Student{
    String ENo, Name;
    int Sub1, Sub2, Sub3, Total;

    Student(){
        Name="";
        Sub1=0;
        Sub2=0;
        Sub3=0;
        Total=0;
    }

    void insertDetails(String eno, String n, int s1, int s2, int s3){
        ENo=eno;
        Name=n;
        Sub1=s1;
        Sub2=s2;
        Sub3=s3;

        // Checking if student has passed in all 3 subjects
        if(Sub1<=50 || Sub2<=50 || Sub3<=50){
            Total=0;
        } else {
            Total=Sub1+Sub2+Sub3;
        }
    }

    void displayDetails(){
        System.out.printf("%s\t| %s\t| %d\t| %d\t| %d\t| %d\n", ENo, Name, Sub1, Sub2, Sub3, Total);
    }

}
class FirstYear extends Student {
    String Class, Mentor;
    int StudCount;
    Student students[];

    FirstYear(String classname, String mentor, int stdctr){
        Class=classname;
        Mentor=mentor;
        StudCount=stdctr;

        // Creating an array of 'stdctr' size
        students=new Student[stdctr];
    }

    void insertDetails(int i, Student student){
        students[i]=student;
    }

    Student BestStudent(){
        Student top= students[0];

        for (int i = 1; i < StudCount; i++) {
            if (students[i].Total>top.Total){
                top=students[i];
            }
        }

        return top;
    }

    void displayDetails(){
        System.out.println("Class:\t"+Class);
        System.out.println("Mentor:\t"+Mentor);
        System.out.println("Count:\t"+StudCount);
        System.out.println("Students:");
        System.out.println("ID\t| Name\t| Sub1\t| Sub2\t| Sub3\t| Total");
        for (int i = 0; i < StudCount; i++) {
            students[i].displayDetails();
        }
    }

}

public class FirstYearStudent {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        // Setting up the class
        String classname, mentor;
        int stdctr;
        System.out.println("Enter Class Name and Mentor Name");
        classname=in.nextLine();
        mentor=in.nextLine();
        System.out.println("Enter Class size");
        stdctr=in.nextInt();
        FirstYear Batch1= new FirstYear(classname, mentor, stdctr);

        // Setting up student for the class
        for (int i = 0; i < stdctr; i++) {
            String eno, name;
            int m1, m2, m3;
            System.out.printf("Student %d\n", i+1);
            System.out.println("Enter ID and name:");
            eno=in.next();
            name=in.next();
            System.out.println("Enter 3 subject marks:");
            m1=in.nextInt();
            m2=in.nextInt();
            m3=in.nextInt();

            // Creating Student data
            Student stud=new Student();
            stud.insertDetails(eno, name, m1, m2, m3);

            // Putting Student into class
            Batch1.insertDetails(i, stud);

        }

        Batch1.displayDetails();
        Student top=Batch1.BestStudent();
        System.out.println("Best Student of the Class:");
        System.out.printf("%s with a total of %d\n", top.Name, top.Total);
    }
}
