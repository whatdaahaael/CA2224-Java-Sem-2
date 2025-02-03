import java.util.Scanner;

class Student {
    String enrollmentNo, name;
    int mark1, mark2, mark3, totalMarks;

    // Constructor
    public Student(String enrollmentNo, String name, int mark1, int mark2, int mark3) {
        this.enrollmentNo = enrollmentNo;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;

        // Check if the student passes all subjects
        if (mark1 >= 50 && mark2 >= 50 && mark3 >= 50) {
            this.totalMarks = mark1 + mark2 + mark3;
        } else {
            this.totalMarks = 0; // Fail case
        }
    }

    // Display Student Details
    public void displayStudent() {
        System.out.println("Enrollment No: " + enrollmentNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: [" + mark1 + ", " + mark2 + ", " + mark3 + "]");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("-----------------------------");
    }
}

// First Year Class
class FirstYear {
    String className, staffName;
    int numStudents;
    Student[] students;

    // Constructor
    public FirstYear(String className, String staffName, int numStudents, Student[] students) {
        this.className = className;
        this.staffName = staffName;
        this.numStudents = numStudents;
        this.students = students;
    }

    // Find the Best Student
    public Student bestStudent() {
        Student best = students[0];
        for (int i = 1; i < numStudents; i++) {
            if (students[i].totalMarks > best.totalMarks) {
                best = students[i];
            }
        }
        return best;
    }

    // Display Class Details
    public void displayClass() {
        System.out.println("Class Name: " + className);
        System.out.println("Staff Name: " + staffName);
        System.out.println("Number of Students: " + numStudents);
        System.out.println("Student Details: ");
        for (Student student : students) {
            student.displayStudent();
        }
    }
}

// Main Class
public class College {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept details for 3 students
        Student[] students = new Student[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Enrollment No: ");
            String enrollmentNo = sc.next();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Marks (Sub1 Sub2 Sub3): ");
            int mark1 = sc.nextInt();
            int mark2 = sc.nextInt();
            int mark3 = sc.nextInt();

            students[i] = new Student(enrollmentNo, name, mark1, mark2, mark3);
        }

        // Create FirstYear object
        FirstYear firstYear = new FirstYear("BCA", "Prof. John", 3, students);

        // Display Class and Best Student
        firstYear.displayClass();
        Student best = firstYear.bestStudent();
        System.out.println("Best Student:");
        best.displayStudent();

        sc.close();
    }
}