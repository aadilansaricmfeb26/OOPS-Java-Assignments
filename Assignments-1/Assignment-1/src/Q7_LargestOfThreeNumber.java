import java.util.Scanner;

public class Q7_LargestOfThreeNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("First number " + num1 + " is the greatest");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Second number " + num2 + " is the greatest");
        } else {
            System.out.println("Third number " + num3 + " is the greatest");
        }

    }
}
