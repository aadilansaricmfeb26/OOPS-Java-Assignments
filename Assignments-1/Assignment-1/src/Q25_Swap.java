public class Q25_Swap {
    static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);

        int c = 40;
        int d = 50;

        c = c + d;
        d = c - d;
        c = c - d;

        System.out.println(c + " " + d);

    }
}
