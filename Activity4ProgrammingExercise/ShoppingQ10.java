/*
 * Question 10:
 * Create an abstract class Product with abstract
 * methods getPrice() and getDescription().
 * Create subclasses Electronics and Clothing.
 *
 *
 * 242BCA16
 * Sujan
 */

package Activity4ProgrammingExercise;

abstract class Product{
    abstract int getPrice();
    abstract String getDescription();
}
class Electronics extends Product{
    int price;
    String desc;

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    String getDescription() {
        return desc;
    }
}
class Clothing extends Product{
    int price;
    String desc;

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    String getDescription() {
        return desc;
    }
}
public class ShoppingQ10 {
    public static void main(String args[]) {
        Electronics e1=new Electronics();
        Clothing c1=new Clothing();
        e1.desc="Laptop";
        e1.price=1000;
        c1.desc="Sweater";
        c1.price=800;
        System.out.printf("Item: %s is priced at: %d\n", e1.getDescription(), e1.getPrice());
        System.out.printf("Item: %s is priced at: %d\n", c1.getDescription(), c1.getPrice());
    }
}
