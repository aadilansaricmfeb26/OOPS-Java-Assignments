class Bank {
    long accountNumber;
    String name;
    double balance;

    Bank(){}

    Bank(long accountNumber, String name, double balance){
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    Bank(long accountNumber, String name){
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = 500;
    }

    void displayDetails(){
        System.out.println("Account No: " + accountNumber);
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Balance: " + balance);
    }

}

public class BankAccountSystem {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        Bank b2 = new Bank(567896789, "Aadil", 3000);
        Bank b3 = new Bank(345678, "Sharul");

        b1.displayDetails();
        System.out.println();
        b2.displayDetails();
        System.out.println();
        b3.displayDetails();

    }
}
