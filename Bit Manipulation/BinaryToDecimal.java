import java.util.Map;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int number = 100;
        int power = 0;
        int decimal = 0;


        while (number > 0) {
            int digit = number % 10;
            decimal = decimal + digit * (int) Math.pow(2, power);
            power = power + 1;
            number = number / 10;
        }
        System.out.println(decimal);
    }
}
