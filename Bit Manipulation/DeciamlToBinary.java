public class DeciamlToBinary {
    public static void main(String[] args) {
        int number  = 256;
        int binary = 0;
        int power = 0;

        while(number > 0) {
            int digit = number % 2;
            binary = binary + digit * (int) Math.pow(10, power);

            power++;
            number = number / 2;
        }
        System.out.println("The equivalent binary number of" + number + " given number is : " + binary);
    }
}
