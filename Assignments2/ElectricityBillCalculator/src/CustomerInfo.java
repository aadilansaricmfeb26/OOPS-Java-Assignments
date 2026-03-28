public class CustomerInfo {
    String customerName;
    long consumerNumber;
    double unitConsumed;
    double totalBillAmount;
    CalculateBill calculateBill;

    CustomerInfo(String customerName, long consumerNumber, double unitConsumed){
        this.customerName = customerName;
        this.consumerNumber = consumerNumber;
        this.unitConsumed = unitConsumed;
        calculateBill = new CalculateBill(unitConsumed);
        totalBillAmount = calculateBill.getTotalBillAmount();
    }

    void displayInfo(){
        System.out.printf("Customer Name: %s \nConsumer Number: %d \nUnit Consumed: %.2f \nTotal Bill Amount: %.2f", customerName, consumerNumber, unitConsumed, totalBillAmount);

    }

}
