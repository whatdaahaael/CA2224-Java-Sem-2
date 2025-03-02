package packagePrograms.student.fulltime.bca;

public class Student {
    String name, sex;
    int age;

    public void inputDetails(String n, String s, int a){
        name=n;
        sex=s;
        age=a;
    }

    public void displayDetails() {
        System.out.printf("%s is a %s aged %d", name, sex, age);
    }
}
