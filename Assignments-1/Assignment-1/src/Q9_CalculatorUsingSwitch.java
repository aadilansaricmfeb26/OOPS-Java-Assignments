import java.util.Scanner;

public class Q9_CalculatorUsingSwitch {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Which operation? (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        System.out.println("Enter last number: ");
        double num2 = sc.nextDouble();



        switch(operator) {
            case '+': {
                double result = num1 + num2;
                System.out.println(result);
                break;
            }
            case '-': {
                double result = num1 - num2;
                System.out.println(result);
                break;
            }
            case '*': {
                double result = num1 * num2;
                System.out.println(result);
                break;
            }
            case '/': {
                double result = num1 / num2;
                System.out.println(result);
                break;
            }
            default:
                System.out.println("Invalid operator!");
        }


    }
}
