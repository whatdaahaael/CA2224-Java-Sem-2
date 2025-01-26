import java.util.Scanner;
public class Student_Data {
    String Name, Course;
    static int ENum=0;
    Student_Data(String name, String cr){
        Name=name;
        Course=cr;
        ENum++;
    }
    public static void main(String args[]) {
        Student_Data Studs[]= new Student_Data[3];
        Studs[0]= new Student_Data("Sujan", "BCA1");
        Studs[1]= new Student_Data("Rahul", "BCADA");
        Studs[2]= new Student_Data("Vijay", "BCom");

        System.out.println("Name\tCourse\tEn. Num");
        for(int i=0;i<3;i++){
            System.out.printf("%s\t%s\t%d\n", Studs[i].Name, Studs[i].Course, i+1);
        }

    }
}
