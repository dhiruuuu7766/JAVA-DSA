public class BitManipulationBasics {

    public static void main(String[] args) {
        int a = 3;
        int b = 4;

//        int  result = a & b;
//        int result = a ^ b ^ a;
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("Result is : a=" + a + " b=" + b);
    }
}
