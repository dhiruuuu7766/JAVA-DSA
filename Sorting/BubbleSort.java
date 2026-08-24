public class BubbleSort {
    public static void print(int[] arr) {
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 9, 7, 6};
        int n = arr.length;

        for (int i=0; i<n; i++){
            for (int j=0; j<n-1-i; i++){
                if(arr[i]> arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        print(arr);
    }
}
