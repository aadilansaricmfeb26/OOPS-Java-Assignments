public class CalculateBill {
    double totalAmount;
    double totalUnit;

    CalculateBill(double totalUnit){
        this.totalUnit = totalUnit;
        totalBillCalculate();
    }

    void billCalc(){
        if (totalUnit <= 100) {
            totalAmount = totalUnit * 5;
        } else if (totalUnit > 100 && totalUnit <=200) {
            totalAmount = totalUnit * 7;
        } else {
            totalAmount = totalUnit * 10;
        }
    }

    void calcSurcharge(){
        if (totalAmount > 1500) {
            double scharge = (totalAmount * 5) / 100;
            totalAmount += scharge;
        }
    }

    void totalBillCalculate() {
        billCalc();
        calcSurcharge();
    }

    double getTotalBillAmount(){
        return totalAmount;
    }

}
