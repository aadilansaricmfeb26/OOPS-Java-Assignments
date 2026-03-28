import java.util.Scanner;

public class Q12_SumOfNaturalNo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the count of natural number: ");
        int count = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += i;
        }

        System.out.println("Sum of " + count + " natural numbers: " + sum);
    }
}
