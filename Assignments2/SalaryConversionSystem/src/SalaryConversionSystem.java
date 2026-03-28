import java.util.Scanner;

public class SalaryConversionSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Salary: ");
        double sal = sc.nextDouble();

        int salInt = (int) sal;
        float salFloat = (float)sal;

        System.out.println("Salary in Double (Original) " + sal);
        System.out.println("Salary in Int " + salInt);
        System.out.println("Salary in Float " + salFloat);

    }
}
