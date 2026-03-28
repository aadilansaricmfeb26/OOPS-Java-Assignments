import java.util.Scanner;

public class Q23_SumOfEvenOddNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the terms: ");
        int terms = sc.nextInt();
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i <= terms; i++) {
            if (i % 2 == 0) {
                oddSum += i;
            } else {
                evenSum += i;
            }
        }

        System.out.println(oddSum);
        System.out.println(evenSum);


    }
}
