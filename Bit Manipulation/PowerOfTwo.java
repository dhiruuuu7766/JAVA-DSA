public class PowerOfTwo {

    public static void main(String[] args) {

        int n = 4;

        if((n & (n - 1)) == 0) {
            System.out.println("The given number is power of two : " + n);
        }
        else {
            System.out.println("The given number is not power of two : " + n);
        }
    }
}
