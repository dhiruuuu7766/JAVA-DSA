import java.util.Arrays;
public class ShallowCopyAndDeepCopy {
    public static void main(String[] args) {
        int a = 4;
        int[] arr = {23, 34, 12, 32, 56};
//        int[] x = arr;  //shallow copy passing original address to the variable x
//        x[2] = 69;
        //System.out.println(arr[2]);

        int[] deep = Arrays.copyOf(arr, arr.length);
        deep[0] = 122;
        System.out.println(arr[0]);
    }
}
