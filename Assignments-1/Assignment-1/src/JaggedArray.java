import java.util.Scanner;

public class JaggedArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rows?");
        int rows = sc.nextInt();

        int arr[][] = new int [rows][];

        for (int i = 0; i < arr.length; i++){
            System.out.println("How many colums in Row " + (i + 1));
            int cols = sc.nextInt();
            arr[i] = new int[cols];
            for(int j = 0; j < cols; j++){
                int ele = sc.nextInt();
                arr[i][j] = ele;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
