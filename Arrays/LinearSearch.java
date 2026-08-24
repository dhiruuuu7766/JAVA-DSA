public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {23, 34, 67, 34, 34, 75};
        int target = 134;
        boolean flag = false;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == target) {
                flag = true;
                break;
            }
        }
        if (flag == true) {
            System.out.println("Target is found in the array");
        } else {
            System.out.println("Target is missing in the array");
        }
    }
}
