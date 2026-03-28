import java.util.Scanner;

public class Q30_Tables {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Enter which number table you want to print: ");
            int num = sc.nextInt();

            System.out.println("Upto?: ");
            int iteration = sc.nextInt();

            for(int i = 1; i <= iteration; i++) {
                System.out.println(num + " x " + i + " = " + num*i);
            }

            System.out.println("Do you want to print another table? (Y/N)");
            choice = sc.next().charAt(0);

        } while(choice == 'y' || choice == 'Y');

        System.out.println("Exiting the program!");

    }

}
