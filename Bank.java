
class BankAccount{
    String name, id;
    float bal;
    BankAccount(String n, String id, float b){
        name=n;
        this.id=id;
        bal=b;
    }
    void deposit(float num){}
    void withdraw(float num){
        if (bal >= num) {
            bal -= num;
            System.out.println("Withdrawn: " + num);
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

class SavingsAccount extends BankAccount{
    float IR; // Interest Rate
    SavingsAccount(String n, String id, float b){
        super(n, id, b);
        IR=5.0f;
    }

    @Override
    void deposit(float num) {
        float IRamnt=num*IR/100f;
        bal += num + IRamnt;
        System.out.println("Savings Account:");
        System.out.printf("%.2f Amount deposited with interest of %.2f\nTotal:%.2f\n", num, IRamnt, num + IRamnt);
    }

    @Override
    void withdraw(float num) {
        if((bal-num)>500){
            System.out.println("Savings Account:");
            super.withdraw(num);
        } else {
            System.out.println("Minimum Balance of 500 required");
        }
    }
}

class CheckingAccount extends BankAccount{
    float OD; // Over Draft
    CheckingAccount(String n, String id, float b){
        super(n, id, b);
        OD=bal*(45.0f/100.0f);
    }

    @Override
    void deposit(float num) {
        bal += num;
        System.out.println("Checking Account:");
        System.out.printf("%.2f Amount deposited\n", num);
    }

    @Override
    void withdraw(float num) {
        if ((bal - num) >= -OD) { // Allows overdraft up to the limit
            bal -= num;
            System.out.println("Checking Account:");
            System.out.printf("%.2f Amount withdrawn\n", num);
        } else {
            System.out.println("Overdraft Limit Reached.");
        }
    }
}

public class Bank {
    public static void main(String args[]) {
        SavingsAccount s1=new SavingsAccount("Sujan", "S1", 12300);
        CheckingAccount c1=new CheckingAccount("Rahul", "C1", 1500);

        s1.deposit(40);
        s1.withdraw(1400);
        System.out.println("Remaining Savings Account Balance:"+s1.bal);

        System.out.println("Overdraft Limit:"+c1.OD);
        c1.deposit(40);
        c1.withdraw(1234);
        System.out.println("Remaining Savings Account Balance:"+c1.bal);


    }
}
