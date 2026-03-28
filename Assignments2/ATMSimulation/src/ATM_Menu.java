import java.util.Scanner;

public class ATM_Menu {
    ATM atm;

    ATM_Menu() {
        atm = new ATM();
    }

    void startMenu(){
        Scanner sc = new Scanner(System.in);

        menu: while(true) {

            System.out.println("-------- Welcome to the ATM Simulation --------");
            System.out.println("-------- ATM Menu --------");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.println("Enter your choice (1-4): ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    atm.checkBalance();
                    break;

                case 2: {
                    System.out.println("Enter the amount: ");
                    double amount = sc.nextDouble();
                    atm.deposit(amount);
                }
                    break;

                case 3: {
                    System.out.println("Enter the amount: ");
                    double amount = sc.nextDouble();
                    atm.withdraw(amount);
                }
                    break;

                case 4:
                    System.out.println("Exiting the ATM program");
                    break menu;

                default:
                    System.out.println("Invalid Choice");
            }

        }

    }


}
