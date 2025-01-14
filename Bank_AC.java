import java.util.Scanner;

public class Bank_AC {
    int ACNum;
    String ACName;
    float ACBal;

    // Constructors
    Bank_AC(int acnum) {
        ACNum = acnum;
    }

    Bank_AC(int acnum, String acname) {
        ACNum = acnum;
        ACName = acname;
    }

    Bank_AC(int acnum, String acname, float bal) {
        ACNum = acnum;
        ACName = acname;
        ACBal = bal;
    }

    // Deposit Method
    void Deposit(float amnt) {
        ACBal += amnt;
        System.out.printf("\n₹%.2f credited to Account: %d\n", amnt, ACNum);
        System.out.printf("Current balance: ₹%.2f\n", ACBal);
    }

    // Withdraw Method
    void Withdraw(float amnt) {
        if (amnt > ACBal) {
            System.out.println("Insufficient balance!");
        } else {
            ACBal -= amnt;
            System.out.printf("\n₹%.2f debited from Account: %d\n", amnt, ACNum);
            System.out.printf("Current balance: ₹%.2f\n", ACBal);
        }
    }

    // Display Method
    void Display() {
        System.out.println("\t\tBANK VIEW CO.");
        System.out.println("Account Details:");
        System.out.printf("AC Num:\t\t%d\n", ACNum);
        System.out.printf("AC Name:\t%s\n", ACName);
        System.out.printf("AC Balance:\t₹%.2f\n", ACBal);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Account Holder Name:");
        String acname = in.nextLine();
        System.out.println("Enter Account Number:");
        int acnum = in.nextInt();
        System.out.println("Enter Initial Account Balance:");
        float acbal = in.nextFloat();

        // Creating an account object
        Bank_AC AC1 = new Bank_AC(acnum, acname, acbal);


        int choice = -1;
        while (choice != 4) {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit Amount");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Display Account Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    float depositAmount = in.nextFloat();
                    AC1.Deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    float withdrawAmount = in.nextFloat();
                    AC1.Withdraw(withdrawAmount);
                    break;
                case 3:
                    AC1.Display();
                    break;
                case 4:
                    System.out.println("Thank you for using our service!");
                    break;
                default:
                    System.out.println("Invalid Choice. Try Again.");
            }
        }
        in.close();
    }
}
