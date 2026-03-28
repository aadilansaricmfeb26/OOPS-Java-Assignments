import java.util.Scanner;

public class Q29_Add_Sub_Cal {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        menu: while(true) {

            System.out.println("\n-------> Welcome to the simple calculator <-------");
            System.out.println("We have:\n1. Addition \n2. Subtraction\n3. Exit");

            System.out.println("\nPlease enter your choice (1-3): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                {
                    double sum = 0;
                    System.out.println("\nHow many operands?");
                    int operands = sc.nextInt();
                    for(int i = 1; i <= operands; i++){
                        System.out.println("Enter the " + i + " number");
                        double num = sc.nextDouble();
                        sum += num;
                    }
                    System.out.println("\nSum: " + sum);
                    break;
                }

                case 2:
                {
                    double dif = 0;
                    System.out.println("\nHow many operands?");
                    int operands = sc.nextInt();
                    for(int i = 1; i <= operands; i++){
                        System.out.println("Enter the " + i + " number");
                        double num = sc.nextDouble();

                        if (i == 1)
                            dif = num;
                        else
                            dif = dif - num; // dif = 10 - 0 = 10. diff = 5-10 = 5
                    }
                    System.out.println("\nDifference: " + dif);
                    break;
                }

                case 3:
                    System.out.println("Exiting the program...");
                    break menu;

                default:
                    System.out.println("Invalid Choice!");
            }

        }
    }
}

/*
29.	Create a menu-driven program:
1.	Add
2.	Subtract
3.	Exit

 */