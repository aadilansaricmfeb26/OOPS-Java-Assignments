import java.util.Scanner;

public class Q22_CheckPrimeNumber {
    static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number: ");
        int num = sc.nextInt();

        boolean flag = (num % 2 == 0);

        if (flag) {
            System.out.println(num + " is not a prime number");
        } else {
            System.out.println(num + " is a prime number");
        }
    }
}
