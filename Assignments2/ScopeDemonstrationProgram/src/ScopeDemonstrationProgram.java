public class ScopeDemonstrationProgram {
    static void scopeTest(){
        int a = 20;
        System.out.println(a);
    }
    public static void main(String[] args) {

        scopeTest();

        {
            int b = 30;
            System.out.println(b);
        }

        for(int i = 0; i < 1; i++){
            int c = 40;
            System.out.println(c);
        }

//        System.out.println(a); // a is a local var of the method scopeTest, it is only accessible within that method. It is destroyed after that method is executed and destroyed
//        System.out.println(b); // b is inside a block, it is only accessible within that block. It is destroyed after the block is executed
//        System.out.println(c); // c is a local vark inside for loop, it is only accessible within that loop. It is destroyed after the loop finishs executing

    }
}
