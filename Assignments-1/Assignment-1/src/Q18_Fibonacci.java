import java.util.Scanner;

public class Q18_Fibonacci {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nextTerm, n1 = 0, n2 = 1;


        System.out.println("Enter the term: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++){
            System.out.print(n1 + " ");
            nextTerm = n1 + n2; // 0 + 1 = 1
            n1 = n2; // n1 = 1;
            n2 = nextTerm; // n2 = 1

        }

    }
}
