import java.util.Scanner;

public class Q15_CountDigitsInNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int counter = 0;

        while (num != 0){
            num = num / 10;
            counter++;
        }

        System.out.println(counter);

    }
}
