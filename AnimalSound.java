
class Animal{
    String name;
    int age;
    Animal(String n, int a){
        name=n;
        age=a;
    }
    void makesound(){}
    void move(){}
}

class Dog extends Animal{
    Dog(String n, int a){
        super(n, a);
    }

    @Override
    void makesound() {
        System.out.println(name+": Woof! Woof!");
    }

    void move(){
        System.out.println(name+": Runs on four legs");
    }
}

class Cat extends Animal{
    Cat(String n, int a){
        super(n, a);
    }

    @Override
    void makesound() {
        System.out.println(name+": Meow! Meow!");
    }

    void move(){
        System.out.println(name+": Jumps");
    }
}

class Bird extends Animal{
    Bird(String n, int a){
        super(n, a);
    }

    @Override
    void makesound() {
        System.out.println(name+": Tweet! Tweet!");
    }

    void move(){
        System.out.println(name+": Flyyyy!");
    }
}

public class AnimalSound {
    public static void main(String args[]) {
        Dog d1=new Dog("Brownie", 5);
        Cat c1=new Cat("Orange", 2);
        Bird b1=new Bird("Panchi", 1);

        d1.makesound();
        d1.move();
        c1.makesound();
        c1.move();
        b1.makesound();
        b1.move();

    }
}
