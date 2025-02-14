import java.util.Scanner;

public class EmployeeArrayHireDate {
    String Name, Date;

    EmployeeArrayHireDate(String name, String date){
        Name=name;
        Date=date;
    }

    static void empSort(EmployeeArrayHireDate employees[]){
        int size=employees.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (employees[j].Date.compareTo(employees[j+1].Date) >0) {
                    // Swap employees[j] and employees[j+1]
                    EmployeeArrayHireDate temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;
                }
            }
        }
    }

    static void empDisplay(EmployeeArrayHireDate employees[]){
        System.out.println("Name\t| Data of appointment");
        for (EmployeeArrayHireDate emp : employees) {
            System.out.printf("%s\t| %s\t\n", emp.Name, emp.Date);
        }
    }

    public static void main(String args[]) {
        EmployeeArrayHireDate[] employees = new EmployeeArrayHireDate[10];
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 10 employees name and date( YYYY-MM-DD ):");
        String n, d;

        for(int i=0; i<10; i++){
            System.out.print("Name: ");
            n=in.next();
            System.out.print("Date: ");
            d=in.next();
            employees[i]= new EmployeeArrayHireDate(n, d);
        }

        System.out.println("Employees sorted by seniority:");
        empSort(employees);
        empDisplay(employees);
    }

}
