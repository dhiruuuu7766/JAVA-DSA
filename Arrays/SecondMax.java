public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {12, 534, 22, 54, 567, 34};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        for(int i=0; i<arr.length; i++) {
            if (smax < arr[i] && arr[i] != max) {
                smax = arr[i];
            }
        }
        System.out.println(smax);
    }
}
