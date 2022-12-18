import java.util.Scanner;
public class Bank {
    public static void main (String[] args) {
        BankAccount obj1= new BankAccount ("User 1","BA101");
        obj1.showmenu();
    }

}


class BankAccount {
    int balance ;
    int previoustransaction;
    String customername;
    String customerid;

    BankAccount (String cname, String cid){
        this.customername =cname;
        this.customerid =cid;
    }

    void deposit (int amount){
        if (amount > 0) {
            balance += amount;
            previoustransaction = amount;
        }
    }
    void withdraw (int amount) {
        if (amount < balance) {
            balance -= amount;
            previoustransaction = -amount;
        }
        else {
            System.out.println("Insufficient funds");
            balance +=0;
        }
    }
    void previoustransaction() {
        if(previoustransaction > 0) {
            System.out.println("Deposited"  + previoustransaction);
        }
        else if (previoustransaction < 0) {
            System.out.println("Withdrawn" + Math.abs(previoustransaction));
        }
        else {
            System.out.println("No transaction occured");
        }
    }
    void showmenu() {
        Scanner sys = new Scanner(System.in);
        System.out.println("Welcome" + " "+customername);
        System.out.println("Your id is " +customerid);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Depoist");
        System.out.println("C. Withdraw");
        System.out.println("D. Check previous transaction");
        System.out.println("E.Exit");

        while (true) {
            System.out.println("*************************************");
            System.out.println("Enter an option");
            System.out.println("*************************************");
            char option =sys.next().charAt(0);
            System.out.println("\n");

            switch(option) {

                case 'A':
                    System.out.println("*************************************");
                    System.out.println("Your balance is : "+balance);
                    System.out.println("*************************************");
                    break;

                case 'B' :
                    System.out.println("*************************************");
                    System.out.println("Enter amount to deposit : ");
                    System.out.println("*************************************");
                    int amount =sys.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("*************************************");
                    System.out.println("Enter amount to withdraw : ");
                    System.out.println("*************************************");
                    int amount2 =sys.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;
                case 'D':
                    System.out.println("*************************************");
                    System.out.println("Check previous transaction : ");
                    System.out.println("*************************************");
                    previoustransaction();
                    System.out.println("\n");
                    break;

                case 'E':
                    System.out.println("*************************************");
                    System.out.println("Exit");
                    break;
                default :
                    System.out.println("Invalid operation Try again");
                    break;
            }

            System.out.println("Thank you for using service");
        }

    }
}



