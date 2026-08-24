public class MinimumOfArray {
    public static void main(String[] args) {
        int[] arr = {145, 62, 3, 47, 75};
        int min = arr[0];

        for(int i=0; i<arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
