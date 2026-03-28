import java.util.Scanner;

class OrderSystem {
    double [] price = new double[3];
    String [] itemNames = new String[3];
    int [] quantity = new int[3];
    double total;
    double gst;
    double [] totalItems = new double[3];

    OrderSystem(){
        this.itemNames[0] = "Plain Rice";
        this.price[0] = 40;
        this.itemNames[1] = "Daal Makhni";
        this.price[1] = 120;
        this.itemNames[2] = "Butter Roti";
        this.price[2] = 25;
    }

    void printMenu(){
        for (int i = 0; i < itemNames.length; i++) {
            System.out.println((i+1) + ". " + itemNames[i] + " Price: " + price[i]);
        }
    }

    void order(int choice) {
        int cho = choice - 1;
        quantity[cho]++;
        totalItems[cho] = quantity[cho] * price[cho];
        System.out.println(itemNames[cho] + " Ordered!");
    }

    void calcBill(){
        for (double totalItem : totalItems) {
            total += totalItem;
        }
        gst = total * 0.05;
        total += gst;
    }

    void printBill() {
        calcBill();
        System.out.println("\n----------- Order Summary -----------\n");
        for (int i = 0; i  < itemNames.length; i++){
            if(quantity[i] > 0) {
                System.out.println(itemNames[i] + ". Quantity " + quantity[i] + " Price " + price[i] + "Rs Total " + totalItems[i] + " Rs");
            }

//            totalItems[i] = quantity[i] * price[i];
        }
        System.out.println("\nGST(5%): " + gst + "Rs Total Bill Amount: " + total + " Rs");
    }

    void startMenu(){
        Scanner sc = new Scanner(System.in);

            System.out.println("-------- Welcome XYZ Restaurant --------");
            printMenu();
            System.out.println("Enter 4 to confirm order and print the bill");
        menu: while(true) {


            System.out.println("\nEnter your choice (1-4): ");
            int choice = sc.nextInt();

            if (choice > 0 && choice < 4) {
                order(choice);
            } else if (choice == 4) {
                printBill();
                break;
            } else {
                System.out.println("Invalid item selected!");
            }
//
//            switch (choice) {
//
//                case 1:
//                    break;
//
//                case 2: {
//                    System.out.println("Enter the amount: ");
//                    double amount = sc.nextDouble();
//                }
//                break;
//
//                case 3: {
//                    System.out.println("Enter the amount: ");
//                    double amount = sc.nextDouble();
//                }
//                break;
//
//                case 4:
//                    System.out.println("Exiting the ATM program");
//                    break menu;
//
//                default:
//                    System.out.println("Invalid Choice");
//            }

        }

    }


}

public class RestaurantOrderManagementSystem {
    static void main(String[] args) {
        OrderSystem or = new OrderSystem();
        or.startMenu();
    }
}
