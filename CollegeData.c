class PersonClass{
    String Name, Address, Email, Pho;
    PersonClass(String n, String a, String e, String p){
        Name=n;
        Address=a;
        Email=e;
        Pho=p;
    }

    @Override
    public String toString() {
        return "Class: Person\nName: " + Name;
    }
}
class StudentClass extends PersonClass{
    String Status;
    StudentClass(String n, String a, String e, String p, String s){
        super(n, a, e, p);
        Status=s;
    }

    @Override
    public String toString() {
        return "Class: Student\nName: " + Name + "\nStatus: "+Status;
    }
}

class EmployeeClass extends PersonClass{
    String Office, HireDate;
    float Salary;
    EmployeeClass(String n, String a, String e, String p, String o, String h, float sal){
        super(n, a, e, p);
        Office=o;
        HireDate=h;
        Salary=sal;
    }

    @Override
    public String toString() {
        return "Class: Employee\nName: " + Name+"\nWorks in: "+Office+"\nHire Data: "+HireDate+"\nSalary: "+Salary;
    }
}

class FacultyClass extends EmployeeClass{
    String Rank;
    int Hours;

    FacultyClass(String n, String a, String e, String p, String o, String h, float sal, String r, int hour){
        super(n, a, e, p, o, h, sal);
        Rank=r;
        Hours=hour;
    }

    @Override
    public String toString() {
        return "Class: Faculty\nName: " + Name + "\nRank: " + Rank;
    }
}

class StaffClass extends EmployeeClass{
    String Title;

    StaffClass(String n, String a, String e, String p, String o, String h, float sal, String t){
        super(n, a, e, p, o, h, sal);
        Title=t;
    }

    @Override
    public String toString() {
        return "Class: Staff\nName: " + Name + "\nTitle: " + Title;
    }
}

public class CollegeData {
    public static void main(String[] args) {
        PersonClass p1 = new PersonClass("Rahul", "123 Street", "9876543210", "rahul@example.com");
        StudentClass su1 = new StudentClass("Sujan", "456 Lane", "8765432109", "sujan@example.com", "First Year");
        EmployeeClass e1 = new EmployeeClass("Kareena", "789 Avenue", "7654321098", "karkar@example.com", "A101", "24th Jan", 35000);
        FacultyClass f1 = new FacultyClass("Yashas", "321 Road", "6543210987", "yashas@example.com", "B202", "30th March", 12000, "Professor", 2);
        StaffClass sa1 = new StaffClass("Vignesh", "654 Street", "5432109876", "eve@example.com", "C303", "23rd April", 50000, "Administrator");

        System.out.println(p1.toString()+"\n");
        System.out.println(su1.toString()+"\n");
        System.out.println(e1.toString()+"\n");
        System.out.println(f1.toString()+"\n");
        System.out.println(sa1.toString()+"\n");
    }
}
