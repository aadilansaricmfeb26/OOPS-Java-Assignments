public class CalculatorSystem {

    static int calculate(int num1, int num2) {
         return num1 + num2;
    }

    static double calculate(double num1, double num2) {
        return num1 + num2;
    }

    static int calculate(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {

        System.out.println(calculate(10,20));
        System.out.println(calculate(10.25,20.75));
        System.out.println(calculate(10,20,30));

    }
}
