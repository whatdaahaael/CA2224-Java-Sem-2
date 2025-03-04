
interface A{
    void read(String s);
}

interface B extends A {
    void show();
}
public class MyClass implements B{
    String str;
    @Override
    public void read(String s){
        str=s;
    }
    @Override
    public void show(){
        System.out.println(str);
    }

    public static void main(String args[]) {
        MyClassPRG13 p1=new MyClassPRG13();
        p1.read("Hello World!");
        p1.show();
    }
}
