public class PassingArrayToMethod {
    public static void main(String[] args) {
        int[] x = {23, 34, 56, 65, 344, 45};
        System.out.println(x[3]);
        change(x);
        System.out.println(x[3]);
    }
    public static void change(int[] x) {
        x[3] = 345;
    }
}
