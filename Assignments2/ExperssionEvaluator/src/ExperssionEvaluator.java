public class ExperssionEvaluator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int res1, res3;
        boolean res2;

        res1 = (a+b) * c; // () has higher predence so, (10 + 20) * 30 = 30 * 30
        res2 = a>b && b>c; // IF both condition is true then assign true to the res2, if condition first is false then it short circuit
                            // 10 > 20 && 20 > 30 = False && False = False
        res3 = a % b; // Divide a with b and return the remainder

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);


    }
}
