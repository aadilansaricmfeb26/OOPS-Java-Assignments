import java.util.Scanner;

public class Q14_ReverseNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();


    /*
        remainder = n % 10 // 234 % 10 = 4 -> Last digit
        revNum = revNum * 10 + remainder // Add the last digit
        n = n / 10                // 3. Remove last digit (e.g., 123 / 10 = 12)
    */

        int reverseNum = 0;
        int rem = 0;
//        reverseNum = num % 10;
//        System.out.println(reverseNum);
        while (num > 0) {
            rem = num % 10;
            reverseNum = reverseNum * 10 + rem; // Entered No: 252  1. 0*10+2 = 2.   2. 2*10+5 = 25. 3. 25*10+2 = 252
              num = num /10;
        }

        System.out.println(reverseNum);

    }
}
