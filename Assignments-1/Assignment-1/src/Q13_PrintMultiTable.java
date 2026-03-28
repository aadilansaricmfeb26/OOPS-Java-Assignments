import java.util.Scanner;

public class Q13_PrintMultiTable {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number for multiplication: ");
        int num = sc.nextInt();

        System.out.println("Upto?: ");
        int iterate = sc.nextInt();

        for(int i = 1; i <= iterate; i++){
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
}
