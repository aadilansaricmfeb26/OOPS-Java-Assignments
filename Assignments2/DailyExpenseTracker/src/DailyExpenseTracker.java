import java.util.Scanner;

class ExpenseTracker {
    double weeklyExp;
    double avgExp;
    double highestExp;
    double lowestExp;
    double [] expense = new double[7];
    Scanner sc = new Scanner(System.in);

    ExpenseTracker(){

    }

    void acceptExpenses(){
        for (int i = 0; i < 7; i++) {
            System.out.println("Enter " + (i+1) + " Day Expense");
            double exp = sc.nextDouble();
            expense[i] = exp;
        }
        System.out.println(expense.length);
    }

    void calcWeeklyExp(){
        for (double exp : expense) {
            weeklyExp += exp;
        }
    }

    void calcAvgExp(){
        avgExp = weeklyExp / expense.length;
    }

    void calcHiLow(){
        double max = expense[0];
        double min = expense[0];
        for(int i = 1; i < 7; i++) {
            if (expense[i] > max){
                max = expense[i];
            }
            if (expense[i] < min) {
                min = expense[i];
            }
        }
        highestExp = max;
        lowestExp = min;
    }

    void printSummary(){
        calcWeeklyExp();
        calcAvgExp();
        calcHiLow();

        System.out.println("Total Weekly Expense: " + weeklyExp);
        System.out.println("Total Average Expense: " + avgExp);
        System.out.println("Total Highest Expense: " + highestExp);
        System.out.println("Total Lowest Expense: " + lowestExp);

        for (int i = 0; i < expense.length; i++) {
            if (highestExp == expense[i]) {
                System.out.println("Your Highest Expenses Occurred on: Day " + (i+1) + " : " + expense[i]);
            }

            if (lowestExp == expense[i]) {
                System.out.println("Your Highest Expenses Occurred on: Day " + (i+1) + " : " + expense[i]);
            }
        }
    }

}

public class DailyExpenseTracker {
    static void main(String[] args) {
        ExpenseTracker ex = new ExpenseTracker();

        ex.acceptExpenses();
        ex.printSummary();

    }
}
