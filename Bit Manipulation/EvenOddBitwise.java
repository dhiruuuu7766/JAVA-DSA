public class EvenOddBitwise {
    public static void main(String[] args) {

        int n = 241;

        if ((n & 1) == 0) {
            System.out.println("Number is even : " + n);
        } else {
            System.out.println("Number is odd : " + n);
        }
    }
}
