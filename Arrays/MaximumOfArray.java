public class MaximumOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 63, 4, 5};
        int max = arr[0];
        //System.out.println(max);

        for(int i=0; i<arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element of array is : " + max);
    }
}
