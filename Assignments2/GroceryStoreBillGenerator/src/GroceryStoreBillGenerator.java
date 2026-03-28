import java.util.Scanner;

class Grocery {
    String [] itemNames;
    int [] quantity;
    double [] price;
    double [] itemTotals;
    double totalBillAmount;
    int itemCount;

    Grocery() {

    }

    void enterItems(){
        Scanner sc = new Scanner(System.in);

        System.out.println("How many items?");
        itemCount = sc.nextInt();

        itemNames = new String[itemCount];
        quantity = new int[itemCount];
        price = new double[itemCount];
        itemTotals = new double[itemCount];

        for (int i = 0; i < itemCount; i++){
            System.out.println("Enter " + (i+1) + " Item Name: ");
            sc.nextLine();
            String iName = sc.nextLine();
            System.out.println("Enter " + (i+1) + " Item Quantity: ");
            int quant = sc.nextInt();
            System.out.println("Enter " + (i+1) + " Price: ");
            double pri = sc.nextDouble();

            itemNames[i] = iName;
            quantity[i] = quant;
            price[i] = pri;
            itemTotals[i] = price[i] * quantity[i];

        }

    }

    void calcBillAmount(){

        for(double itemTotal : itemTotals) {
            System.out.println(itemTotal);
            totalBillAmount += itemTotal;
        }

        if(totalBillAmount > 3000.0) {
            double dis = totalBillAmount * 0.1;
            totalBillAmount += dis;
        }
    }

    void printBill(){
        calcBillAmount();

        for (int i = 0; i < itemCount; i++) {
            System.out.printf("Items Name: %s Quantity: %d Price: %.2f Total: %.2f\n", itemNames[i], quantity[i], price[i], itemTotals[i]);
        }
        System.out.println("-------------------------");
        System.out.println("Total Bill Amount: " + totalBillAmount);
    }

}

public class GroceryStoreBillGenerator {
    static void main(String[] args) {
        Grocery g = new Grocery();

        g.enterItems();
        g.printBill();

    }
}