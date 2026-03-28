import java.util.Scanner;

public class Main {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the customer name: ");
        String customerName = sc.nextLine();

        System.out.println("Enter consumer Number: ");
        long consumerNumber = sc.nextInt();

        System.out.println("Enter the units consumed: ");
        double unit = sc.nextDouble();

        CustomerInfo customerInfo = new CustomerInfo(customerName, consumerNumber, unit);

        customerInfo.displayInfo();

    }
}