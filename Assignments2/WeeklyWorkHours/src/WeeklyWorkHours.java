import java.util.Scanner;

public class WeeklyWorkHours {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]empWorkHr = new int[3][];

        for (int i = 0; i < empWorkHr.length; i++) {
            System.out.println("How many days Employee " + (i+1) + " work? ");
            int cols = sc.nextInt();
            empWorkHr[i] = new int [cols];
            for (int j = 0; j < empWorkHr[i].length; j++) {
                System.out.println("Enter day " + (j+1) + " work hours");
                int hour = sc.nextInt();
                empWorkHr[i][j] = hour;
            }
        }

        for (int [] emp : empWorkHr){
            for (int e : emp) {
                System.out.print(e + " ");
            }
            System.out.println();
        }

    }
}
