public class ATM {
    double balance;

    ATM() {
        this.balance = 500;
    }

    void deposit(double amount) {
        this.balance += amount;
    }

    void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient Balance");
        } else {
            this.balance -= amount;
        }
    }

    void checkBalance() {
        System.out.println("Your balance is: " + balance);
    }

}
